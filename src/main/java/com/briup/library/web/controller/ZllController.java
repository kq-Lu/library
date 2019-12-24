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
@Api(description = "图书管理平台")
public class ZllController {
    @PostMapping("/add")
    @ApiOperation(value = "添加图书")
@ApiImplicitParams({@ApiImplicitParam(name="bookId",value = "编号",paramType = "query",dataType = "int",required = true),
        @ApiImplicitParam(name="name",value = "书名",paramType = "query",dataType = "String"),
        @ApiImplicitParam(name="author",value = "作者",paramType = "query",dataType = "String"),
        @ApiImplicitParam(name="desc",value = "描述",paramType = "query",dataType = "String")})
    public Message add(int bookId,String name,String author,String desc){
        return MessageUtil.success("添加图书成功");
    }
    @PostMapping("/search")
    @ApiOperation(value = "查询图书")
    @ApiImplicitParams({@ApiImplicitParam(name="bookId",value = "编号",paramType = "query",dataType = "int",required = true),
            @ApiImplicitParam(name="name",value = "书名",paramType = "query",dataType = "String"),
            @ApiImplicitParam(name="author",value = "作者",paramType = "query",dataType = "String"),
            @ApiImplicitParam(name="desc",value = "描述",paramType = "query",dataType = "String")})
    public Message search(int bookId,String name,String author,String desc){
        return MessageUtil.success("查询图书成功");
    }
    @GetMapping("/delete")
    @ApiOperation(value = "删除图书")
    @ApiImplicitParams({@ApiImplicitParam(name="bookId",value = "编号",paramType = "query",dataType = "int",required = true),
            @ApiImplicitParam(name="name",value = "书名",paramType = "query",dataType = "String"),
            @ApiImplicitParam(name="author",value = "作者",paramType = "query",dataType = "String"),
            @ApiImplicitParam(name="desc",value = "描述",paramType = "query",dataType = "String")})
    public Message delete(int bookId,String name,String author,String desc){
        return MessageUtil.success("删除图书成功");
    }
    @GetMapping("/update")
    @ApiOperation(value = "更新图书")
    @ApiImplicitParams({@ApiImplicitParam(name="bookId",value = "编号",paramType = "query",dataType = "int",required = true),
            @ApiImplicitParam(name="name",value = "书名",paramType = "query",dataType = "String"),
            @ApiImplicitParam(name="author",value = "作者",paramType = "query",dataType = "String"),
            @ApiImplicitParam(name="desc",value = "描述",paramType = "query",dataType = "String")})
    public Message update(){
        return MessageUtil.success("更新图书成功");
    }
}
