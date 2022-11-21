 
listView('2111test Jobs') {
    description('2111test Jobs')
    jobs {
        regex('2111test_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
