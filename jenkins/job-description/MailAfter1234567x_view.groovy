 
listView('MailAfter1234567x Jobs') {
    description('MailAfter1234567x Jobs')
    jobs {
        regex('MailAfter1234567x_.+')
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
