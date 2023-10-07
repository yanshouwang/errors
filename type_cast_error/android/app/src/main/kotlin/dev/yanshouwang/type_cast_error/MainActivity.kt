package dev.yanshouwang.type_cast_error

import io.flutter.embedding.android.FlutterActivity
import io.flutter.embedding.engine.FlutterEngine

class MainActivity : FlutterActivity() {
    override fun configureFlutterEngine(engine: FlutterEngine) {
        super.configureFlutterEngine(engine)
        val binaryMessenger = engine.dartExecutor.binaryMessenger
        val api = MyApi()
        MyHostApi.setUp(binaryMessenger, api)
    }

    override fun cleanUpFlutterEngine(engine: FlutterEngine) {
        super.cleanUpFlutterEngine(engine)
        val binaryMessenger = engine.dartExecutor.binaryMessenger
        MyHostApi.setUp(binaryMessenger, null)
    }
}
