package com.enchanted.shop.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @ClassName: FileService
 * @Description: TODO
 * @PackageName:com.enchanted.shop.service
 * @Author Enchanted
 * @Date 2024/1/7 22:18
 * @Version 1.0
 */
public interface FileService {
    String uploadUserImg(MultipartFile file);
}
