#!/bin/sh

mysql -u root -p < searchapp_db.sql
mysql -u root -p searchapp < searchapp_db_data.sql
