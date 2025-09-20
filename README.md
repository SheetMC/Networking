# Networking 🔗

* **Module:** `networking`
* **Depends on:** `protocol`
* **Resources:** Libraries like **Ktor** and **Netty** are excellent choices. Ktor, from JetBrains, is a native Kotlin
  framework that uses coroutines, making it a great fit for a pure Kotlin project. Netty is a powerful, battle-tested
  Java networking framework.
* **What you should look at:**
    * **Server Socket:** Set up a server that listens on the default Minecraft port (`25565`).
    * **Connection Management:** Handle incoming connections, managing the lifecycle of each player connection. This
      includes tasks like session creation, keeping track of connection state, and gracefully handling disconnections.
    * **Asynchronous I/O:** Use Kotlin's coroutines to handle I/O without blocking threads. This is crucial for
      performance, as a single thread can manage hundreds or thousands of concurrent connections. You'll use `suspend`
      functions to read and write data to the network.