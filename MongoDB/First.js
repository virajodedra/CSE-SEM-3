const express = require('express');
const mongoose = require('mongoose');
const bodyParser = require('body-parser');
const student = require('./Student');

const app = express();
app.use(bodyParser.urlencoded());


 mongoose.connect("mongodb+srv://viraj:vir%40j%40%4018@viraj.25xoq.mongodb.net/MyDB").then(() => {
    console.log('Database connected!!');

    app.get('/student',async(req,res) => {
        const ans = await Student.find();
        res.send(ans);
    })
    app.get('/student/:age', async(req,res) => {
        const ans = Student.findOne({Age:req.params.age})
        req.send(ans);
    })
    app.post('/student', async(req,res) => {
        stu = new Student({...req.body})
        const ans = await stu.save();
        res.send(ans);
    })
    app.listen(4040,(req,res)=>{
        console.log('Server Started!!')
    })
 })
