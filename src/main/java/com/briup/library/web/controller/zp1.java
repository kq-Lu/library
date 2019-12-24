package com.briup.library.web.controller;

import com.briup.library.util.Message;
import com.briup.library.util.MessageUtil;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(description = "图书管理系统")
public class zp1 {
    @PostMapping("/add")
    @ApiOperation(value = "添加图书信息")
    @ApiImplicitParams({@ApiImplicitParam(name="bno",value = "书号",paramType = "query",dataType = "int",required = true),
            @ApiImplicitParam(name="name",value = "书名",paramType = "query",dataType = "String"),
            @ApiImplicitParam(name="author",value = "作者名",paramType = "query",dataType = "String"),
    })
    public Message add(int bookId,String name,String aname){
        return MessageUtil.success("添加图书信息成功");
    }
    @PostMapping("arch")
    @ApiOperation(value = "查找图书信息")
    public Message search(int bookId,String name,String aname){
        return MessageUtil.success("查找图书信息成功");
    }
    @GetMapping("/delete")
    @ApiOperation(value = "删除图书信息")

    public Message delete(int bno,String name,String aname){
        return MessageUtil.success("删除图书信息成功");
    }
    @GetMapping("/update")
    @ApiOperation(value = "修改图书信息")
    public Message update(){
        return MessageUtil.success("更新图书信息成功");
    }
}