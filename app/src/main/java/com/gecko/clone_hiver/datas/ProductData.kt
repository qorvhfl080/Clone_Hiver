package com.gecko.clone_hiver.datas

import java.io.Serializable

class ProductData(val productId: Int, val productName: String, val brandName: String, var price: Int, var Img: String) : Serializable {

}