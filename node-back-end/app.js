const express = require('express');
const bodyParser = require('body-parser');
const mysql = require('mysql');

const app = express();

//Questo sotto serve anche per il deploy (per ora su localhost)
const port = process.env.PORT || 5000;

app.use(bodyParser.urlencoded({ extended: false }));
app.use(bodyParser.json());

// Listen on environment port or 5000
app.listen(port, ()=> console.log(`Listen on port ${port}`))

// Mysql code
var pool = mysql.createPool({
    connectionLimit : 100,
    host            : 'localhost',
    user            : 'root',
    password        : '',
    database        : 'gestionale_lavanderia'
});

//Create table user
// pool.connect(function(err) {
//     if (err) throw err;
//     console.log("Connected!");
//     var sql = "CREATE TABLE users (id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(255), address VARCHAR(255), phone_number VARCHAR(255))";
//     pool.query(sql, function (err, result) {
//       if (err) throw err;
//       console.log("Table created");
//     });
// });

//Post request (request, response)
app.post('/save_users', (req, res) => {
    pool.getConnection((err, connection) =>{
        if(err) throw err
        console.log("Connected!!")

        const params = req.body

        connection.query('INSERT INTO users SET?', params, (err, rows) => {
            connection.release()

            if(!err){
                res.send(`User with record ID: ${[req.params.id]} has been added`)
            }else{
                console.log(err)
            }
        })
    })
    console.log(req.body)
  });

// get request
app.get('/get_users', (req, res) => {
    pool.getConnection((err, connection) => {
        if(err) throw err
        console.log(`connected as id ${connection.threadId}`)   
        // query(sqlString, callback)
        connection.query('SELECT * from users', (err, rows) => {
            connection.release()

            if(!err) {
                res.send(rows)
            }else{
                console.log(err)
            }
        })
    })
})

