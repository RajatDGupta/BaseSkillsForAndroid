"Vonage is a cloud communications company that provides Unified Communications (UCaaS), Contact Center (CCaaS), and Communication APIs.
Its Business Communications application enables organizations to communicate through voice calls, messaging, video meetings, and collaboration tools from a single platform."


# Vonage Business Communications App Features

## 1. Authentication

* Login
* Passkey Authentication (FIDO/Biometric)
* Secure session management
* Multi-device login support

**Your contribution:**

* Implemented **Passkey authentication**, improving login security and authentication success.

---

## 2. Business Calling

* Make/Receive VoIP calls
* Hold, Mute
* Speaker/Bluetooth support
* Call Transfer
* Call Forwarding
* Do Not Disturb
* Business Caller ID
* Call History
* Missed Calls
* Voicemail ([Google Play][1])

---

## 3. Messaging

* One-to-one Chat
* Group Chat
* Business SMS
* Bulk SMS
* File Sharing
* Image Sharing
* Message Status
* Search Messages
* Notifications
* Unified Inbox ([Vonage][2])

**Your contribution:**

* Developed **Bulk SMS**, supporting **100K+ messages/day**.

---

## 4. Meetings

* Schedule Meetings
* Join Meetings
* Video Calling
* Screen Sharing
* Participant Management
* Audio Controls
* Chat during meetings ([Vonage][2])

**Your contribution:**

* Owned the **Meetings** module.

---

## 5. Contacts

* Business Contacts
* Search Contacts
* Favorite Contacts
* Sync Contacts
* Presence Status ([Vonage][2])

---

## 6. Notifications

* Incoming Calls
* New Messages
* Meeting Reminders
* Missed Calls
* Push Notifications

---

## 7. Settings

* DND
* Call Forwarding
* Ringtones
* Notification Preferences
* Account Settings

---

## 8. Performance

* API Migration
* Crash Reduction
* Network Optimization
* Faster Response Time

**Your contribution:**

* Led API migration and reduced crash rates by approximately **20%**.

---

# Architecture (Interview)

```
Android App
     │
MVVM
     │
Repository
     │
Retrofit
     │
Vonage Backend APIs
```

---

# Tech Stack

* Kotlin
* MVVM
* Clean Architecture
* Coroutines + Flow
* Hilt
* Retrofit
* Jetpack Compose/XML
* Firebase
* REST APIs

---

# If the interviewer asks, "What was your role?"

> "I worked on the Vonage Business Communications Android application. I owned the Messaging, Calling, and Meetings modules. My key contributions included implementing Bulk SMS, integrating Passkey authentication, leading Android API migration to improve stability, reducing crash rates, and collaborating with backend, QA, and product teams to deliver reliable communication features."

This answer is fully aligned with your resume while staying consistent with the capabilities publicly described for the Vonage Business Communications app.

[1]: https://play.google.com/store/apps/details?id=com.vocalocity.Administration&utm_source=chatgpt.com "Vonage Business Communications - Apps on Google Play"
[2]: https://www.vonage.com/unified-communications/features/mobile-app/?utm_source=chatgpt.com "Business Phone App | Vonage"
