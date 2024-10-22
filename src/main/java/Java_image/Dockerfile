FROM openjdk
WORKDIR /app
COPY . /app
# Compile the Java program with proper package structure
RUN javac Java_image/calci.java

# Run the Java program using the full package name
CMD ["java", "Java_image.calci"]