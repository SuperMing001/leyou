package com.leyou.upload.service;

import com.leyou.common.enums.ExceptionEnum;
import com.leyou.common.exception.LyExcetion;
import com.leyou.upload.web.UploadController;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Arrays;
import java.util.List;

/**
 * @author ren.xm
 * @create 2019-09-03 22:52
 */
@Service
@Slf4j
public class UploadService {
    // 支持的文件类型
    private static final List<String> suffixes = Arrays.asList("image/png", "image/jpeg");

    public String uploadImage(MultipartFile file) {
        try {
            // 1、图片信息校验
            // 1)校验文件类型
            String type = file.getContentType();
            if (!suffixes.contains(type)) {
                log.info("上传失败，文件类型不匹配：{}", type);
                throw new LyExcetion(ExceptionEnum.INVALID_FILE_TYPE);
            }
            // 2)校验图片内容
            BufferedImage image = ImageIO.read(file.getInputStream());
            if (image == null) {
                log.info("上传失败，文件内容不符合要求");
                throw new LyExcetion(ExceptionEnum.INVALID_FILE_TYPE);
            }
            // 2、保存图片
            // 2.1、生成保存目录
            File dir = new File("C:\\heima\\upload");
            if (!dir.exists()) {
                dir.mkdirs();
            }
            // 2.2、保存图片
            file.transferTo(new File(dir, file.getOriginalFilename()));

            // 2.3、拼接图片地址
            String url = "http://image.leyou.com/upload/" + file.getOriginalFilename();

            return url;
        } catch (Exception e) {
            log.error("上传文件失败！",e);
            throw new LyExcetion(ExceptionEnum.UPLOAD_FILE_ERROR);
        }
    }
}
