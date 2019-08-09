alter table languages
    add column created_at timestamp not null default NOW(),
    add column updated_at timestamp not null default NOW();

alter table keys
    add column created_at timestamp not null default NOW(),
    add column updated_at timestamp not null default NOW();

alter table translations
    add column created_at timestamp not null default NOW(),
    add column updated_at timestamp not null default NOW();

