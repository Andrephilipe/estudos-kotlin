# Copyright (c) 2020 Oracle Corporation and/or its affiliates. All rights reserved.
#!/bin/sh

sqlplus "$DB_USER"/"$DB_PASSWD"@"$DB_SID" @ /oms/load/create_ac_repasse_ipc.sql
echo "Create table ac_repasse_ipc"

exit 0
