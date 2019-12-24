package com.briup.library.web.controller;

import com.briup.library.util.Message;
import com.briup.library.util.MessageUtil;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class lkqController {
    @PostMapping("/add")
    @ApiImplicitParams({@ApiImplicitParam(name = "BookID",value = "书号",paramType = "query",dataType = "int",required = true),
                        @ApiImplicitParam(name = "BookName",value = "书名",paramType = "query",dataType = "String"),
                        @ApiImplicitParam(name = "BookAuthor",value = "书的作者",paramType = "query",dataType = "String")})
    public Message add(int BookID,String BookName,String BookAuthor){
        return MessageUtil.success("添加成功");
    }
    @PostMapping("/change")
    @ApiImplicitParam(name = "BookID",value = "书号修改",paramType = "query",dataType = "int",required = true)
    public Message change(int BookID){
        return MessageUtil.success("修改成功");
    }
    @GetMapping("/delete")
    @ApiImplicitParams({@ApiImplicitParam(name = "BookID",value = "书号删除",paramType = "query",dataType = "int",required = true),
                        @ApiImplicitParam(name="BookName",value = "书名删除",paramType = "query",dataType = "String"),
                        @ApiImplicitParam(name = "BookAuthor",value = "书的作者删除",paramType = "query",dataType = "String")
    })
    public Message delete(int BookID,String BookName,String BookAuthor){
        return MessageUtil.success("删除成功");
    }
    @GetMapping("/find")
    @ApiImplicitParam(name = "BookID",value = "书号查询",paramType = "query",dataType = "int",required = true)
    public Message find(int BookID){
        return MessageUtil.success("查找成功");
    }
}
