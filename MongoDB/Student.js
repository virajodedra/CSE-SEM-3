const express = require('express');
const mongoose = require('mongoose');

const schema = mongoose.Schema({
    Enroll_no : Number,
    Name : String,
    Email : String,
    Age : Number
});
module.exports = mongoose.model("Student",schema);
