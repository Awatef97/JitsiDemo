package com.example.jitsidemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.jitsi.meet.sdk.JitsiMeet
import org.jitsi.meet.sdk.JitsiMeetActivity
import org.jitsi.meet.sdk.JitsiMeetConferenceOptions
import java.net.URL

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val serverURL = URL("https://dev2pengage.perfect-engage.com/jitsi")

        val defaultOptions = JitsiMeetConferenceOptions.Builder()
            .setServerURL(serverURL)
            // When using JaaS, set the obtained JWT here
            //.setToken("MyJWT")
            // Different features flags can be set
//             .setFeatureFlag("toolbox.enabled", true)
//             .setFeatureFlag("filmstrip.enabled", true)
//            .setConfigOverride("remoteVideoMenu.disabled",true)
//            .setConfigOverride("remoteVideoMenu.disableKick",true)
//            .setConfigOverride("remoteVideoMenu.disableGrantModerator",true)
//            .setConfigOverride("remoteVideoMenu.disablePrivateChat",true)
//
//            .setConfigOverride("audioLevelsInterval",20)
//            .setConfigOverride("startVideoMuted",false)
//            .setConfigOverride("startSilent",false)
//            .setConfigOverride("disableAudioLevels",false)
//            .setConfigOverride("startWithAudioMuted",true)
//            .setConfigOverride("enableNoAudioDetection",false)
//            .setConfigOverride("startWithVideoMuted",false)
//            .setConfigOverride("e2eping.enable",false)
//            .setFeatureFlag("welcomepage.enabled", true)
            .setConfigOverride("p2p.enable",false)
            .build()
        JitsiMeet.setDefaultConferenceOptions(defaultOptions)

// Build options object for joining the conference. The SDK will merge the default
// one we set earlier and this one when joining.
        val options = JitsiMeetConferenceOptions.Builder()
            .setRoom("https://dev2pengage.perfect-engage.com/jitsi/Awatef1111")
            // Settings for audio and video
//            .setAudioMuted(false)
//            .setVideoMuted(false)
            .build()

// Launch the new activity with the given options. The launch() method takes care
// of creating the required Intent and passing the options.
        JitsiMeetActivity.launch(this, options)

    }
}