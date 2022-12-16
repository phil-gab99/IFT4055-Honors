CREATE
(testRepo:Repo {name:"testRepo"})
,(m1:Model {
    name: "m1",
    modelId: "1",
    isDeleted: "false",
    owner: "Philippe",
    creationDate: "2020-01-08"
})
,(testRepo)-[:models]->(m1)
,(ms11:ModelSnapshot {
    name: "ms11",
	path: "Room1.dr",
	diffCreated: [
        "Table", 
        "Table.x = 2", 
        "Table.y = 5"
    ],
	diffDeleted: [
    ],
	diffModified: [
    ]
})
,(m1)-[:lifetime]->(ms11)
,(ms12:ModelSnapshot {
    name: "ms12",
	path: "Room1.dr",
	diffCreated: [
        "chair", 
        "chair.order = 1", 
        "Table.around = [chair]"
    ],
	diffDeleted: [
    ],
	diffModified: [
        "Table.x"
    ]
})
,(m1)-[:lifetime]->(ms12)
,(ms13:ModelSnapshot {
    name: "ms13",
	path: "Room1.dr",
	diffCreated: [
        "NewTable", 
        "NewTable.x = 2", 
        "NewTable.y = 5", 
        "NewTable.around = [chair]"
    ],
	diffDeleted: [
        "Table", 
        "Table.x = 2", 
        "Table.y = 5", 
        "Table.around = [chair]"
    ],
	diffModified: [
    ]
})
,(m1)-[:lifetime]->(ms13)
,(m1)-[:current]->(ms13)
,(m2:Model {
    name: "m2",
    modelId: "2",
    isDeleted: "true",
    owner: "Philippe",
    creationDate: "2020-01-08"
})
,(testRepo)-[:models]->(m2)
,(ms21:ModelSnapshot {
    name: "ms21",
	path: "Room2.dr",
	diffCreated: [
        "BigTable", 
        "c1", 
        "BigTable.x = 91", 
        "BigTable.y = 72", 
        "c1.order = 1", 
        "BigTable.around = [c1]"
    ],
	diffDeleted: [
    ],
	diffModified: [
    ]
})
,(m2)-[:lifetime]->(ms21)
,(ms22:ModelSnapshot {
    name: "ms22",
	path: "SpecialRooms/Room2.dr",
	diffCreated: [
    ],
	diffDeleted: [
    ],
	diffModified: [
    ]
})
,(m2)-[:lifetime]->(ms22)
,(ms23:ModelSnapshot {
    name: "ms23",
	path: "SpecialRooms/Room2.dr",
	diffCreated: [
    ],
	diffDeleted: [
        "c1", 
        "BigTable.around = [c1]", 
        "c1.order = 1"
    ],
	diffModified: [
    ]
})
,(m2)-[:lifetime]->(ms23)
,(ms24:ModelSnapshot {
    name: "ms24",
	path: "SpecialRooms/Room2.dr",
	diffCreated: [
    ],
	diffDeleted: [
        "BigTable", 
        "BigTable.x = 91", 
        "BigTable.y = 72"
    ],
	diffModified: [
    ]
})
,(m2)-[:lifetime]->(ms24)
,(m2)-[:current]->(ms24)
,(m3:Model {
    name: "m3",
    modelId: "3",
    isDeleted: "false",
    owner: "Philippe",
    creationDate: "2020-01-08"
})
,(testRepo)-[:models]->(m3)
,(ms31:ModelSnapshot {
    name: "ms31",
	path: "SpecialRooms/Room3.dr",
	diffCreated: [
        "MyTable", 
        "MyTable.x = 2"
    ],
	diffDeleted: [
    ],
	diffModified: [
    ]
})
,(m3)-[:lifetime]->(ms31)
,(ms32:ModelSnapshot {
    name: "ms32",
	path: "SpecialRooms/Room3.dr",
	diffCreated: [
        "MyChair", 
        "MyTable.around = [MyChair]"
    ],
	diffDeleted: [
    ],
	diffModified: [
        "MyTable.x = 3"
    ]
})
,(m3)-[:lifetime]->(ms32)
,(ms33:ModelSnapshot {
    name: "ms33",
	path: "SpecialRooms/Room3.dr",
	diffCreated: [
        "MyTable.y = 20"
    ],
	diffDeleted: [
    ],
	diffModified: [
    ]
})
,(m3)-[:lifetime]->(ms33)
,(ms34:ModelSnapshot {
    name: "ms34",
	path: "SpecialRooms/Room3.dr",
	diffCreated: [
    ],
	diffDeleted: [
    ],
	diffModified: [
        "MyTable.y = 6"
    ]
})
,(m3)-[:lifetime]->(ms34)
,(m3)-[:current]->(ms34)
,(main:Branch {
    name: "main",
    branchName: "main",
    active: "true"
})
,(testRepo)-[:branches]->(main)
,(c1:Commit:GenericCommit {
    name: "c1",
    hash: "h12345",
    author: "Philippe",
    message: "Message 1",
    timestamp: "2020-01-08"
})
,(main)-[:commits]->(c1)
,(c2:Commit:GenericCommit {
    name: "c2",
    hash: "h23456",
    author: "Bob",
    message: "Message 2",
    timestamp: "2020-02-02"
})
,(main)-[:commits]->(c2)
,(c3:Commit:GenericCommit {
    name: "c3",
    hash: "h34567",
    author: "Alice",
    message: "Message 3",
    timestamp: "2021-01-01"
})
,(main)-[:commits]->(c3)
,(c6:Commit:MergeCommit {
    name: "c6",
    hash: "h67890",
    author: "Alice",
    message: "Merge 6",
    timestamp: "2022-04-01"
})
,(main)-[:commits]->(c6)
,(main)-[:parent]->(c1)
,(main)-[:head]->(c6)
,(b1:Branch {
    name: "b1",
    branchName: "b1",
    active: "false"
})
,(testRepo)-[:branches]->(b1)
,(c4:Commit:GenericCommit {
    name: "c4",
    hash: "h45678",
    author: "Philippe",
    message: "Message 4",
    timestamp: "2021-01-02"
})
,(b1)-[:commits]->(c4)
,(c5:Commit:GenericCommit {
    name: "c5",
    hash: "h56789",
    author: "Bob",
    message: "Message 5",
    timestamp: "2021-03-23"
})
,(b1)-[:commits]->(c5)
,(b1)-[:parent]->(c4)
,(b1)-[:head]->(c5)
,(c6)-[:from]->(c3)
,(c6)-[:to]->(c5)
,(c1)-[:next]->(c2)
,(c1)-[:modifiedModels]->(ms11)
,(c1)-[:modifiedModels]->(ms21)
,(c1)-[:modifiedModels]->(ms31)
,(c2)-[:next]->(c3)
,(c2)-[:modifiedModels]->(ms22)
,(c3)-[:next]->(c6)
,(c3)-[:modifiedModels]->(ms12)
,(c3)-[:modifiedModels]->(ms32)
,(c6)-[:modifiedModels]->(ms13)
,(c6)-[:modifiedModels]->(ms24)
,(c6)-[:modifiedModels]->(ms34)
,(c4)-[:next]->(c5)
,(c4)-[:modifiedModels]->(ms23)
,(c5)-[:modifiedModels]->(ms33)
,(ms11)-[:next]->(ms12)
,(ms12)-[:next]->(ms13)
,(ms21)-[:next]->(ms22)
,(ms22)-[:next]->(ms23)
,(ms23)-[:next]->(ms24)
,(ms31)-[:next]->(ms32)
,(ms32)-[:next]->(ms33)
,(ms33)-[:next]->(ms34)
;