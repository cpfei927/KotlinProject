# KotlinProject
Android studio集成

一、安装Kotlin

Android studio 2.3及以上版本安装Kotlin

打开settings (Ctrl+Alt+S) ---> Plugins ---> 点击下方 Install JetBrains Plugins 或 Browse Repositories ---> 搜索 kotlin 安装即可 

二、配置项目（Project）build.gradle文件 如下：

buildscript {

    ext.kotlin_version = '$kotlin_version'// 添加版本 如：1.1.2
    
    repositories {
        jcenter()
        maven {url 'http://maven.aliyun.com/nexus/content/groups/public/'}
    }
    
    dependencies {
        classpath 'com.android.tools.build:gradle:2.3.0'
        // 添加版本
        classpath "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version"
        // 如下 ：classpath "org.jetbrains.kotlin:kotlin-gradle-plugin:1.1.2-4"
    }
    
}

allprojects {

    repositories {
        jcenter()
        // 添加maven 地址
        maven {url 'http://maven.aliyun.com/nexus/content/groups/public/'}
    }
}


task clean(type: Delete) {

    delete rootProject.buildDir
}

三、配置Module的build.gradle

apply plugin: 'com.android.application'

apply plugin: 'kotlin-android'//这里添加

apply plugin: 'kotlin-android-extensions'//这里添加


android {

    compileSdkVersion 25
    buildToolsVersion "25.0.2"
    defaultConfig {
        applicationId "com.cpfei.kotlinproject"
        minSdkVersion 15
        targetSdkVersion 25
        versionCode 1
        versionName "1.0"
        testInstrumentationRunner "android.support.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        release {
            minifyEnabled false
            proguardFiles getDefaultProguardFile('proguard-android.txt'), 'proguard-rules.pro'
        }
    }
}

dependencies {

    compile fileTree(include: ['*.jar'], dir: 'libs')
    compile 'com.android.support:appcompat-v7:25.3.0'
    compile 'com.android.support.constraint:constraint-layout:1.0.2'
    //主要是这两个依赖
    // eg : compile 'org.jetbrains.kotlin:kotlin-stdlib-jre7:1.1.2-4'
    compile 'org.jetbrains.kotlin:kotlin-stdlib-jre7:$kotlin_version'
    // eg : compile 'org.jetbrains.kotlin:kotlin-reflect:1.1.2-4'
    compile 'org.jetbrains.kotlin:kotlin-reflect:$kotlin_version'
    
}

四、配置完成，Sync Project


五、将Java代码转换成Kotlin(以MainActivity 为例) 
 
 打开MainActivity文件
  选择Code ---> Convert Java File to Kotlin File   
  MianActivity.java文件就变成MainActivity.kt文件

六、新建Kotlin Activity 、class、 file
    
    在对应的包下右键 New ---> Kotlin Activity
    
    eg : com.cpfei.kotlinproject包下右键
   
   
   
