pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

rootProject.name = "TerminalSDKIntegration"
include(":androidApp")
include(":PaymentSDK")
include(":CardReaderSDK")
include(":StripeWrapper")
