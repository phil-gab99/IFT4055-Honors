CREATE
(main:Branch{branchName:"main", active: true}),
(b1:Branch{branchName:"b1", active: true}),

(c1:GenericCommit:Commit{name:"c1", hash:"h12345", author:"Philippe", message:"Message 1", timestamp:"2020-01-08"}),
(c2:GenericCommit:Commit{name:"c2", hash:"h23456", author:"Bob", message:"Message 2", timestamp:"2020-02-02"}),
(c3:GenericCommit:Commit{name:"c3", hash:"h34567", author:"Alice", message: "Message 3", timestamp:"2021-01-01"}),
(c4:GenericCommit:Commit{name:"c4", hash:"h45678", author:"Philippe", message: "Message 4", timestamp:"2021-01-02"}),
(c5:GenericCommit:Commit{name:"c5", hash:"h56789", author:"Bob", message: "Message 5", timestamp:"2021-03-23"}),
(c6:MergeCommit:Commit{name:"c6", hash:"h67890", author:"Alice", message: "Merge 1", timestamp:"2022-04-01"}),

(m1:Model{name: "m1", isDeleted: false, owner:"Philippe", creationDate:"2020-01-08"}),
(m2:Model{name: "m2", isDeleted: true, owner:"Philippe", creationDate:"2020-01-08"}),
(m3:Model{name: "m3", isDeleted: false, owner:"Philippe", creationDate:"2020-01-08"}),

(ms11:ModelSnapshot{name: "ms11", path:"~/Projects/DiningRoom/Room1.dr", diffModified:[], diffCreated:["Table", "Table.x", "Table.y"], diffDeleted:[]}),
(ms21:ModelSnapshot{name: "ms21", path:"~/Projects/DiningRoom/Room2.dr", diffModified:[], diffCreated:["BigTable", "BigTable.x", "BigTable.y", "BigTable.around", "c1", "c1.order"], diffDeleted:[]}),
(ms31:ModelSnapshot{name: "ms31", path:"~/Projects/DiningRoom/SpecialRooms/Room3.dr", diffModified:[], diffCreated:["MyTable", "MyTable.x"], diffDeleted:[]}),

(ms22:ModelSnapshot{name: "ms22", path:"~/Projects/DiningRoom/SpecialRooms/Room2.dr", diffModified:[], diffCreated:[], diffDeleted:[]}),

(ms12:ModelSnapshot{name: "ms12", path:"~/Projects/DiningRoom/Room1.dr", diffModified:["Table.x"], diffCreated:["Table.around", "chair", "chair.order"], diffDeleted:[]}),
(ms32:ModelSnapshot{name: "ms32", path:"~/Projects/DiningRoom/SpecialRooms/Room3.dr", diffModified:["MyTable.x"], diffCreated:["MyTable.around", "MyChair"], diffDeleted:[]}),

(ms23:ModelSnapshot{name: "ms23", path:"~/Projects/DiningRoom/SpecialRooms/Room2.dr", diffModified:[], diffCreated:[], diffDeleted:["BigTable.around", "c1", "c1.order"]}),
(ms33:ModelSnapshot{name: "ms33", path:"~/Projects/DiningRoom/SpecialRooms/Room3.dr", diffModified:[], diffCreated:["MyTable.y"], diffDeleted:[]}),

(ms13:ModelSnapshot{name: "ms13", path:"~/Projects/DiningRoom/Room1.dr", diffModified:[], diffCreated:["NewTable", "NewTable.x", "NewTable.y", "NewTable.around"], diffDeleted:["Table", "Table.x", "Table.y", "Table.around"]}),
(ms24:ModelSnapshot{name: "ms24", path:null, diffModified:[], diffCreated:[], diffDeleted:["BigTable", "BigTable.x", "BigTable.y"]}),
(ms34:ModelSnapshot{name: "ms34", path:"~/Projects/DiningRoom/SpecialRooms/Room3.dr", diffModified:["MyTable.y"], diffCreated:[], diffDeleted:[]}),

(c1)-[:next]->(c2),
(c2)-[:next]->(c3),
(c4)-[:next]->(c5),

(main)-[:parent]->(c1),
(main)-[:head]->(c3),
(main)-[:commits]->(c1),
(main)-[:commits]->(c2),
(main)-[:commits]->(c3),

(b1)-[:parent]->(c2),
(b1)-[:head]->(c5),
(b1)-[:commits]->(c4),
(b1)-[:commits]->(c5),

(c6)-[:from]->(c3),
(c6)-[:to]->(c5),

(m1)-[:lifetime]->(ms11),
(m1)-[:lifetime]->(ms12),
(m1)-[:lifetime]->(ms13),
(m1)-[:current]->(ms13),

(ms11)-[:next]->(ms12),
(ms12)-[:next]->(ms13),

(m2)-[:lifetime]->(ms21),
(m2)-[:lifetime]->(ms22),
(m2)-[:lifetime]->(ms23),
(m2)-[:lifetime]->(ms24),
(m2)-[:current]->(ms24),

(ms21)-[:next]->(ms22),
(ms22)-[:next]->(ms23),
(ms23)-[:next]->(ms24),

(m3)-[:lifetime]->(ms31),
(m3)-[:lifetime]->(ms32),
(m3)-[:lifetime]->(ms33),
(m3)-[:lifetime]->(ms34),
(m3)-[:current]->(ms34),

(ms31)-[:next]->(ms32),
(ms32)-[:next]->(ms33),
(ms33)-[:next]->(ms34),

(c1)-[:modifiedModels]->(ms11),
(c1)-[:modifiedModels]->(ms21),
(c1)-[:modifiedModels]->(ms31),

(c2)-[:modifiedModels]->(ms22),

(c3)-[:modifiedModels]->(ms12),
(c3)-[:modifiedModels]->(ms32),

(c4)-[:modifiedModels]->(ms23),

(c5)-[:modifiedModels]->(ms33),

(c6)-[:modifiedModels]->(ms13),
(c6)-[:modifiedModels]->(ms24),
(c6)-[:modifiedModels]->(ms34);
