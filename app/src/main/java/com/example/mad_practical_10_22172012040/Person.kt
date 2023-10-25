package com.example.mad_practical_10_22172012040

import org.json.JSONObject
import java.io.Serializable

class Person(var id:String,
var name : String,
var emailId : String,
var PhoneNo : String,
var Address : String,
var latitude : Double,
var longutude : Double):Serializable{

    constructor(jsonObject: JSONObject):this("","","","","",0.0,0.0) {
        id = jsonObject.getString("id")
        emailId = jsonObject.getString("email")
        PhoneNo = jsonObject.getString("phone")
        val profileJson = jsonObject.getJSONObject("profile")
        name = profileJson.getString("name")
        Address = profileJson.getString("address")
        val locationJson = profileJson.getJSONObject("location")
        latitude = locationJson.getDouble("lat")
        longutude = locationJson.getDouble("long")
    }

}