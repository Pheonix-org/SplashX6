package com.shinkson47.SplashX6.utility

import java.io.Serializable

/**
 * # A serializable class with transient properties.
 * A deserialization method is provided for handling the transient properties.
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 03/02/2022
 */
interface PartiallySerializable : Serializable{
    fun deserialize()
}