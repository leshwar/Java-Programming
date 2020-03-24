import javax.management.snmp.manager;
import javax.management.snmp;
class Snmpimple
{
public static void main (String args[]) throws Exception
{

String hostname = String ("summer");
int port = 8085;
// Create an SnmpPeer object for representing the remote agent.
SnmpPeer agent = new SnmpPeer( hostname, port );
// Create parameters to associate with the remote agent.
// When creating the parameter object, you specify the read and write
// community to be used when querying the agent.
SnmpParameters params = new SnmpParameters("public", "private");
// The newly created parameter object must be associated with the agent.
agent.setSnmpParam( params );
System.out.println(agent);
}
}