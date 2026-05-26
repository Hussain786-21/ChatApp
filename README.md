This is a real-time chat application built using Spring Boot and WebSocket with STOMP messaging protocol. 
The application allows multiple users to connect and exchange messages instantly without page refresh. 
It uses SockJS as a fallback for browsers that don't support WebSocket, and Bootstrap 5 for a clean 
and responsive UI. The backend is built with Java 17 and Spring Boot 4.0.6, using Lombok to reduce 
boilerplate code. Users can enter their name, connect to the chat server, and start sending messages 
that are instantly visible to all connected users in real time.


#How to use it 
1.Open the project directory in the terminal and run mvnw.cmd spring-boot:run to start the server (or) simply by clicking run button on vscode/IntelliJ idea.

2.Once the server is running, open your browser and navigate to http://localhost:8082/chat.

3.Enter your name in the Your name... field.

4.Click the Connect button to establish a WebSocket connection with the server.

5.Once connected, the Send button will be enabled and the Connect button will show Connected.

6.Type your message in the Type a message... field and click Send to broadcast it to all connected users.

7.To test real-time messaging, open a second browser tab, navigate to http://localhost:8082/chat, enter a different name and click Connect.

8.Send a message from one tab and it will instantly appear in all other connected tabs in real time.

9.To stop the application, press Ctrl + C in the terminal.
