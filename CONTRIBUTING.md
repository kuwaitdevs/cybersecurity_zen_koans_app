# Contributing to Cybersecurity Zen Koans App

Thank you for your interest in contributing! We welcome all kinds of contributions, from app development to curating Zen koans.

## 🚀 Option 1: Contribute to App Features

If you're a developer and want to help improve the app:

1. Fork the repo and clone it locally.
2. Set up the development environment (see [README](./README.md)).
3. Check out open issues labeled `feature`, `bug`, or `enhancement`.
4. Create a branch, make your changes, and submit a pull request.

Please follow our [coding guidelines](#coding-guidelines) and write meaningful commit messages.

## 🧘 Option 2: Add or Update Zen Koans

Want to improve the Zen experience? You can:

- Add new koans (koan text and the technical explanation of the koan)
- Fix typos or update existing koans

Koans are stored in [KoansRepository.kt](./app/src/main/java/com/kuwaitdevs/cybersecurityzenkoans/data/KoansRepository.kt) for now. We are planning to move it into a dedicated server where you can add koans for others to read and ponder:

1. Go to the end of the list in [KoansRepository.kt](./app/src/main/java/com/kuwaitdevs/cybersecurityzenkoans/data/KoansRepository.kt)
2. Add a new element to the list with the following format:
   ```kt
        KoanWithExplanation(
            "Koan",
            "Explanation",
            "# 6 digit Alphanumeric ID"
        )
   ```
3. Submit a pull request.

## 🙏 General Guidelines

- Be respectful and open-minded.
- Write clear pull request titles and descriptions.
- Link related issues when possible.

## 📬 Need Help?

Open an issue or reach out via [hello@kuwaitdevs.com].

Happy hacking and zen-writing!
