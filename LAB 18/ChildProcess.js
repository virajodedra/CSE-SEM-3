const child_process = require('child_process');

child_process.exec('java ChildProcessDemo',(err,stdout,stdin) => {
    console.log("Ther error is :",err);
    console.log(stdout);
});