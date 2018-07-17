#!/bin/sh

mysql -u root < searchapp_db.sql
mysql -u root searchapp < searchapp_db_data.sql
