def call(string project_name){
 echo "Building the code with Docker"
 sh "docker build -t ${project_name} ."
}
