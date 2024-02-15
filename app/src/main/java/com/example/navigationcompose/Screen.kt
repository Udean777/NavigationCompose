package com.example.navigationcompose

const val DETAIL_ARGUMENT_KEY = "id"
const val DETAIL_ARGUMENT_KEY2 = "name"

sealed class Screen(val route: String) {
    object Home: Screen(route = "home_screen")
    object Detail: Screen(route = "detail_screen?id={$DETAIL_ARGUMENT_KEY}&name={$DETAIL_ARGUMENT_KEY2}"){
//        Optional arguments
//        fun passId(id: Int = 0): String {
//            return "detail_screen?id=$id"
//        }

//        Multiple Optional arguments
        fun passNameId(id: Int = 0, name: String = "Sajudin"): String {
            return "detail_screen?id=$id&name=$name"
        }

//        single argument
//        fun passId(id : Int): String{
//            return this.route.replace(oldValue = "{$DETAIL_ARGUMENT_KEY}", newValue = id.toString())
//        }

//        Multiple arguments
//        fun passNameId(
//            id: Int,
//            name: String
//        ): String{
//            return "detail_screen/$id/$name"
//        }
    }
}