package dev.yanshouwang.type_cast_error

import android.util.Log

class MyApi : MyHostApi {
    companion object {
        val TAG: String = MyApi::class.java.simpleName
    }

    override fun testTypeCastError(testArgs: MyTestArgs) {
        val itemsArgs = testArgs.itemsArgs
        for (itemArgs in itemsArgs) {
            val key = itemArgs.key
            val value = itemArgs.value
            Log.d(TAG, "testTypeCastError: $key: $value")
        }
    }
}