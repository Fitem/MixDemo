package com.fitem.mixdemo

import android.app.Application
import io.flutter.embedding.engine.FlutterEngine
import io.flutter.embedding.engine.FlutterEngineCache
import io.flutter.embedding.engine.dart.DartExecutor

/**
 * Created by LeiGuangwu on 2023/3/9.
 */
class App : Application() {

    private val flutterEngine by lazy {
        FlutterEngine(this).apply {
            dartExecutor.executeDartEntrypoint(DartExecutor.DartEntrypoint.createDefault())
        }
    }

    override fun onCreate() {
        super.onCreate()
        FlutterEngineCache.getInstance().put("my_engine_id", flutterEngine)
    }

    override fun onTerminate() {
        super.onTerminate()
        flutterEngine.destroy()
    }
}