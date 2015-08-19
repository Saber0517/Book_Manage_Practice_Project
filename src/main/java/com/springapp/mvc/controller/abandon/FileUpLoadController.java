package com.springapp.mvc.controller.abandon;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartResolver;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by ZHANGJA4 on 8/19/2015.
 */

@Controller
public class FileUpLoadController {
    @RequestMapping("/fileUpload")
    public String upload() {
        return "fileUpload";
    }

    //    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public String getFile(String fileName, MultipartFile pic) {
        System.out.println(fileName);
        System.out.println(pic.getOriginalFilename() + " ..." + pic.getSize());
        System.out.println("upload");
        return "fileUpload";
    }

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public String getFiles(String fileName, @RequestParam(value = "pic") LinkedList<MultipartFile> pic) {
        System.out.println("getFiles");
        System.out.println(fileName);
        for (MultipartFile multipartFile : pic) {
            System.out.println(multipartFile.getOriginalFilename() + " ..." + multipartFile.getSize());
        }
        System.out.println("upload");
        return "fileUpload";
    }
}
