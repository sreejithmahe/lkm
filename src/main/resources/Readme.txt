//create database carinfo;


//GET
http://localhost:8081/car/getCarinfo/

//GET By Id

http://localhost:8081/car/getCarinfo/5

{
    "carName": "Maruti",
    "carId": 5,
    "price": 397601.01,
    "model": "2021"
}


//POST
http://localhost:8081/car/addCarinfo

[
 {
"carName" :"Mahindra",
"price":1100000.97,
"model":"Scorpio"
},
 {
"carName" :"Mahindra",
"price":1400000.97,
"model":"Xuv500"
}
]


//UPDATE
http://localhost:8081/car/updateCarinfo

{
    "carName": "Maruti",
    "carId": 5,
    "price": 397601.01,
    "model": "2021"
}


//DELETE
http://localhost:8081/car/deleteCarinfo/1
