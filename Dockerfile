FROM tomcat:10.1-jdk21-openjdk-slim

# Copy your WAR file to the webapps directory
COPY jean.war /usr/local/tomcat/webapps/jean.war

# Expose the default Tomcat port
EXPOSE 8082

# Start Tomcat
CMD ["catalina.sh", "run"]