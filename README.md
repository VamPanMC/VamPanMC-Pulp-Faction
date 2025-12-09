# VamPanMC's Pulp Faction
<img width="1039" height="161" alt="image" src="https://github.com/user-attachments/assets/a11dccb3-36f8-47b9-9db8-7d74cea35801" />

<img width="1157" height="827" alt="image" src="https://github.com/user-attachments/assets/b4af7dca-ccd0-4058-9985-71f71efc9060" />

### Hello there, fellow Minecrafter!

I am **VamPanMC**, a rather old soul — a few thousand years, give or take. You might notice I’m not your average creature of the night… I’m a vampire–panda hybrid. Quite the rare species, I know. Don’t worry, though — I’ve already fed, so your neck is safe… for now.

<img width="384" height="198" alt="image" src="https://github.com/user-attachments/assets/748f4430-2b0a-428a-afbf-45e533207630" />
<img width="377" height="193" alt="image" src="https://github.com/user-attachments/assets/44a73704-35cb-4d9a-a86c-07bc5171a68c" />
<img width="377" height="193" alt="image" src="https://github.com/user-attachments/assets/ec645e06-b118-44ff-b207-d58aa35cb369" />

```
Recipes
```

<img width="550" height="513" alt="image" src="https://github.com/user-attachments/assets/60807bdb-0fd5-4006-920f-0244970fb6f0" /><img width="176" height="166" alt="image" src="https://github.com/user-attachments/assets/273e1d14-b18f-4b86-934d-6dfabbaa7c50" />

<img width="536" height="502" alt="image" src="https://github.com/user-attachments/assets/81da4172-d541-4851-adf6-3126d7c428a2" /><img width="176" height="166" alt="image" src="https://github.com/user-attachments/assets/c257cfff-c431-4a6c-a706-93f05f0e86bc" />

```
UI's for the Manual and Auto Pulpers
```

I was watching how some of you make paper from ... suger cane and was so confused, all that waste of sweet sweet sugar, so I have made you a tool we had in the old country, it's called a Pulper, you put in things like wood to get paper, wheet to get slim, home made slim is SO fun but then I was thinking people make so many items they didn't meant to or find things that they will never use, well you can pulp them in to rubble and cook that rule in to resources

<img width="548" height="68" alt="image" src="https://github.com/user-attachments/assets/e1c87f53-cb67-4ffc-9338-f04dee0f00ae" />
<img width="547" height="70" alt="image" src="https://github.com/user-attachments/assets/c0e22df0-73bd-4ff9-ab7a-d53014124e5d" />

The Pulper just works like a Crafting table, you put a item in it creates the item but it starts doing it soon as you put the item in like a funince and soon as you close the UI it will spit your items back out.

Other mods to use: I recommend you installing [JEI](https://modrinth.com/mod/jei), this isn't a must but it's a recommendation as you will be able to see Pulpers GUI in [JEI](https://modrinth.com/mod/jei) with all our recipes, we use tags to group the items we supported in the vanilla game meaning it's hard to list ever since one, there is 18 recipes built in but using the tags means one recipe could be loads, EG gold rubble is able to accept 9 items, diamond rubble is able to accept 7, I hope you get my point


<img width="702" height="851" alt="image" src="https://github.com/user-attachments/assets/c2844058-171a-42d2-ad29-d7ef33cf280b" />

```
Pulp Faction in JEI
```

**Todo Key**: <img width="116" height="28" alt="image" src="https://github.com/user-attachments/assets/9114bcd0-dd39-4ca0-91fd-7531f1bf20f7" />, <img width="134" height="28" alt="image" src="https://github.com/user-attachments/assets/f125dc3a-1a96-4b53-a7c6-fdc0bc329317" />, <img width="156" height="28" alt="image" src="https://github.com/user-attachments/assets/81c29639-fd2b-47e5-b9fc-69dd4b48f92c" />
<br>
<br>
<img width="185" height="28" alt="image" src="https://github.com/user-attachments/assets/5eb85968-72a0-4491-9653-1fae552649dd" /><br><img width="231" height="28" alt="image" src="https://github.com/user-attachments/assets/2d95eacd-6aea-4ede-bd95-49ee8637f027" /><br><img width="295" height="28" alt="image" src="https://github.com/user-attachments/assets/e6c4e72a-d681-44b1-beb4-883acb32ba31" /><br><img width="346" height="28" alt="image" src="https://github.com/user-attachments/assets/828d2147-e36b-479e-862c-645a54401d25" /><br><img width="227" height="28" alt="image" src="https://github.com/user-attachments/assets/c12dadd8-33b7-47cd-8b7a-10bee28cbab4" /><br><img width="335" height="28" alt="image" src="https://github.com/user-attachments/assets/c604a176-3a3c-468f-93ae-650bd6a49ead" /><br><img width="234" height="28" alt="image" src="https://github.com/user-attachments/assets/705dd04e-2455-49a5-99fe-d7ea84a20d0c" /><br>
<br>  
<br>
**Some items the Pulper can scrap**:<br>
<img width="549" height="69" alt="image" src="https://github.com/user-attachments/assets/a0cb5be0-4aab-404a-8439-1634394d89b5" /><br><img width="549" height="69" alt="image" src="https://github.com/user-attachments/assets/a0ca60f8-b06a-49b8-a9e7-0526ba0a796d" />
<br>
<br>
**FAQ**:
**Q**: Can I add custom recipes?
**A**: Using the namespace under data vppf and under recipes you can add your own recipes data/vppf/recipe/your_recipe.json
```json
{
  "type": "vppf:pulper",
  "input": {
    "item": "minecraft:bricks",
    "count": 1
  },
  "output": {
    "id": "minecraft:clay_ball",
    "count": 2
  },
  "category": [
    "misc"
  ]
}
```
**Q**: In the screenshot you have the item over campfires and laver but don't say we need to, do we?

**A**: No you don't need to, but if you put it over a nromal campfire it will speed it up a little, a little more over a soul campfire and even faster over lavar but no you don't have to do this.

--

So, dear Minecrafter, I bring you this Pulper as a gift. I can’t wait to see what you grind and pulp up with it.

For those of you brilliant tinkerers who build modpacks — yes, you may use my creations within them. Consider this my blessing. Spread the magic far and wide, little human.

But don’t let that make you careless, hmm? My kindness doesn’t make you immune to my appetite. One day, when the moon is full and I’m feeling just a bit peckish… well, let’s just say I might come looking for a snack.

Sleep tight, little human.






