cmake_minimum_required(VERSION 3.8)

set(CMAKE_MODULE_PATH ${CMAKE_CURRENT_LIST_DIR}/KotlinCMakeModule)

project(KRouter Kotlin)

konanc_executable(
    NAME router
    SOURCES src/main/kotlin/http.kt src/main/kotlin/router.kt src/main/kotlin/hello.kt src/main/kotlin/tree.kt)

