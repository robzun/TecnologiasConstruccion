pub mod components;
pub mod prefix;
pub mod builder;
pub mod Prefix;

use builder::Director;

use crate::prefix::*;
use crate::builder::Director;

fn main() {
    let mut builder = PrefixBuilder::default();
    Director::construct_cinnamon(&mut builder);
    let linux = builder.build();
    let a = linux.save_prefix("linux.txt");
}