package net.squanchy.service.firestore.model.twitter

import kotlin.properties.Delegates

class FirestoreTweet {

    lateinit var text: String
    lateinit var user: FirestoreTwitterUser
    lateinit var entities: FirestoreTwitterEntities
    lateinit var displayTextRange: Array<Int>
}

class FirestoreTwitterUser {

    lateinit var name: String
    lateinit var screenName: String
    lateinit var id: String
    var profileImageUrl: String? = null
}

class FirestoreTwitterEntities {

    var hashtags: List<FirestoreTwitterHashtag> = emptyList()
    var userMentions: List<FirestoreTwitterMention> = emptyList()
    var media: List<FirestoreTwitterMedia> = emptyList()
    var urls: List<FirestoreTwitterUrl> = emptyList()
}

class FirestoreTwitterHashtag {

    lateinit var text: String
    var start: Int by Delegates.notNull()
    var end: Int by Delegates.notNull()
}

class FirestoreTwitterMention {

    var start: Int by Delegates.notNull()
    var end: Int by Delegates.notNull()
    lateinit var name: String
    lateinit var screenName: String
    lateinit var id: String
}

class FirestoreTwitterUrl {

    var start: Int by Delegates.notNull()
    var end: Int by Delegates.notNull()
    lateinit var expandedUrl: String
    lateinit var displayUrl: String
    lateinit var url: String
}

class FirestoreTwitterMedia {

    lateinit var displayUrl: String
    var start: Int by Delegates.notNull()
    var end: Int by Delegates.notNull()
    lateinit var expandedUrl: String
    lateinit var type: String
    lateinit var mediaUrl: String
    lateinit var url: String
    lateinit var id: String
}
