from pyrogram import Client, filters
from pyrogram.types import Message
from dotenv import load_dotenv
import os

load_dotenv()

API_ID = int(os.getenv("API_ID"))
API_HASH = os.getenv("API_HASH")
BOT_TOKEN = os.getenv("BOT_TOKEN")
SOURCE_CHANNEL = os.getenv("SOURCE_CHANNEL")  # e.g., "techcrunch"
TARGET_CHANNEL = int(os.getenv("TARGET_CHANNEL"))  # e.g., -100xxxxxxxxxx

# Create userbot client
userbot = Client("userbot_session", api_id=API_ID, api_hash=API_HASH)

# Create bot client
bot = Client("bot_session", api_id=API_ID, api_hash=API_HASH, bot_token=BOT_TOKEN)

@userbot.on_message(filters.chat(SOURCE_CHANNEL))
async def forward_post(client, message: Message):
    try:
        await message.copy(chat_id=TARGET_CHANNEL)
        print("Post forwarded successfully.")
    except Exception as e:
        print(f"Error forwarding post: {e}")

async def main():
    await userbot.start()
    await bot.start()
    print("Bot is running and listening for new posts...")
    await userbot.idle()

if __name__ == "__main__":
    import asyncio
    asyncio.run(main())