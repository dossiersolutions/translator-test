alter table languages
    add column created_at timestamp,
    add column updated_at timestamp;

alter table keys
    add column created_at timestamp,
    add column updated_at timestamp;

alter table translations
    add column created_at timestamp,
    add column updated_at timestamp;

