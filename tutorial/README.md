# multithreaded-challenge tutorial

A thread can be understood as a piece of code that performs its work in parallel while the program is running.
One process consists of several threads. You will need knowledge of running threads for the tasks.

The first method of creating a thread is the Thread class:

![](thread_class.PNG)

The second method of creating a thread is the Runnable interface:

![](runnable.PNG)

Shorter usage Runnable shows picture below:

![](implementation_runnable.PNG)


# How to establish a connection on the client side and how to answer it on the server side

If you already know how to create a thread, the next step is to learn how to get the two sides of the communication together.
The first example is setting up a connection on the client side. It shows picture below:

![](connection_client.PNG)

On the client side, it should look something like this:

![](connection_server.PNG)

The main handling for accepting new threads on the server side should look something like this:

![](main_server_thread_logic.PNG)

# How to deal with multithreading support(only for task1, task2, task3)

1.The first mechanism for code synchronization is the synchronized keyword. They can be placed on the entire method or on a code snippet.
The synchronized block allows you to handle a code snippet for only one thread. Example synchronized block in picture below:


![](synchronized.PNG)

![](synchronized1.PNG)

The second way to lock the critical section that is worth knowing about is Lock, especially their sub-interface - ReadWriteLock. They work just like the synchronized keyword, but give developers much more freedom.
As the name suggests, in this case we are dealing with two types of locks: read - for reading and write - for writing. In the sections in which we use Read Locks, many threads at once can access the code block. In the place where the Write Lock appears, only one thread can perform the code at once.

Examples using:

![](write_and_read_lock.PNG)

This information should help you to solve the 3 tasks that have been prepared.