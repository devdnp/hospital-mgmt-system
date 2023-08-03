
## Hospital Management System Api Documentation


# Staff Related API

### Register Staff
To register new staff 
* **URL**: http://localhost:8088/api/staff/register
* **Method**: post
* **Request**:
```json
{
  "name":"Shubham",
  "email":"shubham@gmail.com",
  "loginId":"shubham234",
  "password":"12345",
  "gender":"M"
}
```
After successfully register then we will get response like this

**Response**
```
{
    "message": "Successful: Staff created successfully!",
    "status": true,
    "data": {
        "staffId": "60188e6f-e332-4fe9-84b6-1c82dd500b5c",
        "name": "Shubham",
        "email": "shubham@gmail.com",
        "loginId": "shubham234",
        "password": "12345",
        "gender": "M"
    }
}
```


###  Staff Login
To register new staff
* **URL**: http://localhost:8088/api/staff/login
* **Method**: post
* **Request**:
```json
{
  "loginId":"shubham234",
  "password":"12345"
}
```
After successfully login then we will get response like this

**Response**
```
{
    "message": "Successful: Staff Login successfully!",
    "status": true,
    "data": {
        "staffId": "60188e6f-e332-4fe9-84b6-1c82dd500b5c",
        "name": "Shubham",
        "email": "shubham@gmail.com",
        "loginId": "shubham234",
        "password": "12345",
        "gender": "M"
    }
}
```

### Get Staff details
To register new staff
* **URL**: http://localhost:8088/api/staff/<staffId>
* **URL(example)**: http://localhost:8088/api/staff/60188e6f-e332-4fe9-84b6-1c82dd500b5c
* **Method**: get
* **Request**:
null


**Response**
```
{
    "message": "Successful: Successfully!",
    "status": true,
    "data": {
        "staffId": "60188e6f-e332-4fe9-84b6-1c82dd500b5c",
        "name": "Shubham",
        "email": "shubham@gmail.com",
        "loginId": "shubham234",
        "password": "12345",
        "gender": "M"
    }
}
```


# Patient Related API

## Create New Patient 
To create new patient, the staff must login
* **URL**: http://localhost:8088/api/patient
* **Method**: Post
* **Request**:
```json
{
  "patientName": "Tomoko",
  "gender": "Male",
  "patientAge": 30,
  "roomNo": "104",
  "doctorName": "Dr. Neeru",
  "staffId": "60188e6f-e332-4fe9-84b6-1c82dd500b5c"
}
```
**Response**
```
{
"message": "Successful: patient created successfully!",
"status": true,
"data": {
    "patientId": "02942676-37c2-4818-b92f-1abeccc95679",
    "staffId": "60188e6f-e332-4fe9-84b6-1c82dd500b5c",
    "patientName": "Tomoko",
    "patientAge": 30,
    "roomNo": 104,
    "doctorName": "Dr. Neeru",
    "expenses": null,
    "status": null,
    "admitDate": null,
    "isValid": 1,
    "gender": "Male"
    }
}
```

### Get Patient details
To register new staff
* **URL**: http://localhost:8088/api/patient/<patientId>
* **URL(example)**: http://localhost:8088/api/patient/02942676-37c2-4818-b92f-1abeccc95679
* **Method**: get
* **Request**:
  null


**Response**
```
{
    "message": "Successful: Successfully!",
    "status": true,
    "data": {
        "patientId": "02942676-37c2-4818-b92f-1abeccc95679",
        "staffId": "60188e6f-e332-4fe9-84b6-1c82dd500b5c",
        "patientName": "Tomoko",
        "patientAge": 30,
        "roomNo": 104,
        "doctorName": "Dr. Neeru",
        "expenses": null,
        "status": null,
        "admitDate": null,
        "isValid": 1,
        "gender": "Male"
    }
}
```


### Update Patient details
To register new staff
* **URL**: http://localhost:8088/api/patient/<patirnt>
* **URL(example)**: http://localhost:8088/api/staff/60188e6f-e332-4fe9-84b6-1c82dd500b5c
* **Method**: PUT

 ex. Update Doctor name

**Request**:

```
    {
    "patientName": "Tomoko",
    "gender": "Male",
    "patientAge": 30,
    "roomNo": "104",
    "doctorName": "Dr. Neeru Mehta"
    }
  ```

**Response**
```
{
    "message": "Successful: Patient Updated successfully!",
    "status": true,
    "data": {
        "patientId": "02942676-37c2-4818-b92f-1abeccc95679",
        "staffId": "60188e6f-e332-4fe9-84b6-1c82dd500b5c",
        "patientName": "Tomoko",
        "patientAge": 30,
        "roomNo": 104,
        "doctorName": "Dr. Neeru Mehta",
        "expenses": null,
        "status": null,
        "admitDate": null,
        "isValid": 1,
        "gender": "Male"
    }
}
```

**Note**: we cant update any of field without sending all details 

**Request**:

```
    {
        "patientName": "Tomoko"
    }
 ```
Or
```
    {
        "patientAge": 56
    }
 ```
Or

 **#** To Update patient status 

* 1 -> admit
* 2 -> discharge
```
    {
        "status": 1
    }
 ```





### Delete Patient details
To register new staff
* **URL**: http://localhost:8088/api/patient/<patirnt>
* **URL(example)**: http://localhost:8088/api/patient/60188e6f-e332-4fe9-84b6-1c82dd500b5c
* **Method**: DELETE

**Response**
````json
{
    "message": "Successful: Deleted Successfully!",
    "status": true
}
````


------------------------------------------------------------------------------------------

# JWT Authentication  

### implementing.................

