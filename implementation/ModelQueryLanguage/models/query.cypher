MATCH (m1:Model)-[cr1:current]->(ms1:ModelSnapshot)
WHERE m1.owner = "Philippe"
RETURN ms1.path;
MATCH (c1:Commit)-[mm1:modifiedModels]->(ms2:ModelSnapshot)
WHERE "MyTable.x = 3" IN ms2.diffModified
RETURN c1.timestamp;
