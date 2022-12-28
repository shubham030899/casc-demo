pipelineJob("job-configurator") {
    properties {
        disableConcurrentBuilds()
        durabilityHint {
            hint('PERFORMANCE_OPTIMIZED')
        }
        pipelineTriggers {
            triggers {
                gitlab {
                    triggerOnPush(true)
                    triggerOnMergeRequest(false)
                }
            }
        }
    }
