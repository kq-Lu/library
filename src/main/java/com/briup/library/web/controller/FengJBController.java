package com.briup.library.web.controller;

import com.briup.library.util.Message;
import com.briup.library.util.MessageUtil;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/FengJB")
@Api(description = "图书管理器")
public class FengJBController {
    @GetMapping("/login4")
    @ApiOperation(value = "登录")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "Id",value = "用户编号",paramType = "query",dataType = "int"),
            @ApiImplicitParam(name = "pwd",value = "密码",paramType = "query",dataType = "String")
    })
    public Message login4(int Id, String pwd){

        return MessageUtil.success("登录成功！");
    }
    @GetMapping("/add4")
    @ApiOperation(value = "添加图书")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "BookId",value = "图书编号",paramType = "query",dataType = "int",required = true),
            @ApiImplicitParam(name = "bookName",value = "图书名",paramType = "query",dataType = "String"),
            @ApiImplicitParam(name = "author",value = "图书作者",paramType = "query",dataType = "String"),
            @ApiImplicitParam(name = "status",value = "在借状态",paramType = "query",dataType = "String")
    })
    public Message add4(int BookId , String bookName, String author, String status){
        return MessageUtil.success("添加图书成功");
    }
    @GetMapping("/delete4")
    @ApiOperation(value = "删除图书")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "BookId",value = "图书编号",paramType = "query",dataType = "int" ,required = true),
            @ApiImplicitParam(name = "bookName",value = "图书名",paramType = "query",dataType = "String"),

    })
    public Message delete4(int BookId , String bookName){
        return MessageUtil.success("删除图书成功");
    }
    @GetMapping("/update4")
    @ApiOperation(value = "修改图书信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "BookId",value = "图书编号",paramType = "query",dataType = "int",required = true),
            @ApiImplicitParam(name = "bookName",value = "图书名",paramType = "query",dataType = "String"),
            @ApiImplicitParam(name = "author",value = "图书作者",paramType = "query",dataType = "String"),
            @ApiImplicitParam(name = "status",value = "在借状态",paramType = "query",dataType = "String")
    })
    public Message update4(int BookId , String bookName, String author, String status){
        return MessageUtil.success("修改信息成功");
    }
    @GetMapping("/search4")
    @ApiOperation(value = "查找图书")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "BookId",value = "图书编号",paramType = "query",dataType = "int",required = true),
            @ApiImplicitParam(name = "bookName",value = "图书名",paramType = "query",dataType = "String"),

    })
    public Message search4(int Id , String bookName){
        return MessageUtil.success("已搜索到1条信息");
    }
    @GetMapping("/addBorrowRecord4")
    @ApiOperation(value = "添加借书记录")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "BookId",value = "图书编号",paramType = "query",dataType = "int",required = true),
            @ApiImplicitParam(name = "bookName",value = "图书名",paramType = "query",dataType = "String"),
            @ApiImplicitParam(name = "Id",value = "用户编号",paramType = "query",dataType = "int"),
            @ApiImplicitParam(name = "username",value = "用户名",paramType = "query",dataType = "String")
    })
    public Message addBorrowRecord4(int BookId , String bookName, int Id,String username){
        return MessageUtil.success("添加记录成功");
    }
    @GetMapping("/addReturnRecord4")
    @ApiOperation(value = "添加还书记录")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "BookId",value = "图书编号",paramType = "query",dataType = "int",required = true),
            @ApiImplicitParam(name = "bookName",value = "图书名",paramType = "query",dataType = "String"),
            @ApiImplicitParam(name = "Id",value = "用户编号",paramType = "query",dataType = "int"),
            @ApiImplicitParam(name = "username",value = "用户名",paramType = "query",dataType = "String")
    })
    public Message addReturnRecord4(int BookId , String bookName, int Id,String username){
        System.out.println("修改在借状态和借书记录");
        return MessageUtil.success("添加记录成功");
    }
    @GetMapping("/addUser4")
    @ApiOperation(value = "添加用户")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name",value = "姓名",paramType = "query",dataType = "String",required = true),
            @ApiImplicitParam(name = "idCardNumber",value = "身份证号",paramType = "query",dataType = "String",required = true),
            @ApiImplicitParam(name = "teleNumber",value = "手机号码",paramType = "query",dataType = "int",required = true),
            @ApiImplicitParam(name = "email",value = "邮箱",paramType = "query",dataType = "String"),
            @ApiImplicitParam(name = "address",value = "家庭住址",paramType = "query",dataType = "String")

    })
    public Message addUser( String name, String idCardNumber,int teleNumber,String email,String address){
        System.out.println("您的编号为********");
        return MessageUtil.success("添加新用户成功");
    }
    @GetMapping("/PayFine4")
    @ApiOperation(value = "交罚款")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "Id",value = "用户编号",paramType = "query",dataType = "int"),
            @ApiImplicitParam(name = "username",value = "用户名",paramType = "query",dataType = "String")
    })
    public Message PayFine4( int Id,String username ){
        System.out.println("需要缴纳**元的罚款金额");
        return MessageUtil.success("缴纳罚款成功");
    }
}
