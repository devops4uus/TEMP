
def workspacecleanup (workspace){
    
    deleteDir()

    dir("${workspace}@tmp") {

        deleteDir()
    }

}
