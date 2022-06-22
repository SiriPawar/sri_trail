import jenkins.model.*
def matchedJobs = Jenkins.instance.items.findAll { job ->
job.name =~ "ScratchOrgs_Test_"
}
matchedJobs.each { job ->
println job.name
job.delete()
}
def matchedJobs1 = Jenkins.instance.items.findAll { job ->
job.name =~ "ScratchOrgs_Dev_"
}
matchedJobs1.each { job ->
println job.name
job.delete()
}
def matchedJobs2 = Jenkins.instance.items.findAll { job ->
job.name =~ "ScratchOrgs_Blank_"
}
matchedJobs2.each { job ->
println job.name
job.delete()
}
