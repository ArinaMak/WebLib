const express = require("express")
const mysql = require('mysql')
const config = require("config")
const cors = require("cors")
const {addNewBook} = require("./books")
const {connectingToDB} = require('./connectingToDB')

const app = express()
app.use(cors());
app.use(express.json());
const PORT = config.get('serverPort')



const db = connectingToDB();

app.post ("/reg", (req, res) => {
    const login = req.body.login;
    const email = req.body.email;
    const surname = req.body.surname;
    const name = req.body.name;
    const patronymic = req.body.patronymic;
    const userpassword = req.body.userpassword;

    db.query(
        "INSERT INTO libweb.user (name, surname, middle_name, login, email, password) VALUES (?,?,?,?,?,?)",
        [name, surname, patronymic, login, email, userpassword],
        (err, result) => {
            if (err) {
                throw new Error('BROKEN')
            } else {
                res.send("Values inserted");
            }
        }
    );

});
app.post ("/bookshelf", addNewBook );

app.get ("/section", (req, res) => {
    console.log("hello world2222222222!")
    db.query(
        "SELECT * FROM libweb.section",
        (err, result) => {
            if (err) {
                console.log(err);
            } else {
                res.send(result);
                console.log("res");
                console.log("result", result);
            }
        }
    );

});

app.get ("/bookshelf/books", (req, res) => {
    db.query(
        "SELECT * FROM libweb.book",
        (err, result) => {
            if (err) {
                console.log(err);
            } else {
                res.send(result);
                console.log("res");
                console.log("result", result);
            }
        }
    );

});



app.listen(PORT, () => {
    console.log('server started on port ', PORT);
});

console.log("hello world!")


