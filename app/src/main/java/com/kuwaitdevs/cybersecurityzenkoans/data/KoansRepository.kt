package com.kuwaitdevs.cybersecurityzenkoans.data

data class KoanWithExplanation(
    val koanText: String,
    val technicalExplanation: String,
    val uniqueCode: String
)

class KoansRepository {
    val koansWithExplanations = listOf(
        KoanWithExplanation(
            "The strongest firewall is useless against a user who clicks 'Allow'.",
            "This koan highlights the critical importance of user behavior in security. Even with advanced technical controls like firewalls, uninformed user decisions can bypass security measures. Social engineering attacks exploit this vulnerability by manipulating users rather than attacking systems directly.",
            "7H93FT"
        ),
        KoanWithExplanation(
            "The best password is one that even you cannot remember, yet never forget.",
            "This refers to password managers which generate complex passwords that are virtually impossible to memorize but are securely stored. This balances security (complex passwords resistant to brute force) with usability (not needing to remember them manually).",
            "X2QP48"
        ),
        KoanWithExplanation(
            "In the realm of cybersecurity, paranoia is not a disorder but a prerequisite.",
            "Security professionals must constantly consider potential threats and vulnerabilities that others might overlook. This 'security mindset' involves thinking defensively and anticipating attacks, which can appear as paranoia to others but is essential for effective security posture.",
            "B5JR9A"
        ),
        KoanWithExplanation(
            "A secure system is not one that cannot be breached, but one that knows it has been breached.",
            "This emphasizes the importance of detection capabilities over prevention alone. Advanced threat detection, security monitoring, and incident response are critical as perfect prevention is impossible. The average breach discovery time still exceeds 200 days in many industries.",
            "KT62L3"
        ),
        KoanWithExplanation(
            "The hacker sees not a wall, but a door with a thousand locks, each waiting to be picked.",
            "Attackers view security barriers as challenges rather than deterrents. While defenders must protect all entry points, attackers need only find one vulnerability. This asymmetric advantage explains why persistent threats eventually succeed against inadequately monitored systems.",
            "DW81M5"
        ),
        KoanWithExplanation(
            "The master makes their system secure by making it honest with itself about its vulnerabilities.",
            "Security requires honest assessment of weaknesses. Vulnerability management, penetration testing, and threat modeling allow organizations to identify and mitigate risks before attackers exploit them, rather than denying or concealing weaknesses.",
            "P7V3N0"
        ),
        KoanWithExplanation(
            "Trust, but verify. Then verify again.",
            "This references Zero Trust security principles where systems verify every access attempt, regardless of source. Continuous validation, least privilege access, and assumption of breach are core to this model, which is increasingly replacing perimeter-based security approaches.",
            "G4H6Y9"
        ),
        KoanWithExplanation(
            "The wisest security expert knows that perfect security does not exist.",
            "Security is risk management, not risk elimination. No system can be 100% secure while remaining functional. Security professionals must balance protection with usability, focusing resources on critical assets and accepting that some residual risk will always remain.",
            "ZK21R7"
        ),
        KoanWithExplanation(
            "In cyberspace, what appears as a small crack can become the grand canyon.",
            "Minor vulnerabilities can be chained together or exploited in unexpected ways to create major security breaches. Privilege escalation attacks often begin with seemingly trivial flaws that provide initial access, then expand to critical compromise.",
            "F9QT5E"
        ),
        KoanWithExplanation(
            "The enemy that you know is less dangerous than the vulnerability you don't.",
            "Unknown vulnerabilities (zero-days) pose greater risks than known threat actors. While you can prepare for known attack techniques, zero-day exploits can bypass defenses because there are no patches or signatures to detect them until they're discovered.",
            "3J8WU2"
        ),
        KoanWithExplanation(
            "Security is not a product, but a process that walks alongside vigilance.",
            "This highlights the continuous nature of security. It's not about implementing a one-time solution but about maintaining an ongoing process of monitoring, updating, and responding to new threats as they arise.",
            "S5PD7V"
        ),
        KoanWithExplanation(
            "A security camera pointed at nothing offers perfect surveillance of nothing.",
            "Surveillance and monitoring systems must be properly configured and maintained to be effective. Otherwise, they can create a false sense of security and fail to detect actual threats.",
            "U4N9C3"
        ),
        KoanWithExplanation(
            "In the cybersecurity battle, visibility is the foundation of victory.",
            "Being able to see and monitor all activities and potential threats within a system or network is crucial to effective security. This visibility allows for quick detection and response to potential issues.",
            "Y8R5T1"
        ),
        KoanWithExplanation(
            "A vulnerability scanner finds only what it knows to look for; human creativity finds what has never been seen before.",
            "Automated vulnerability scanners are essential tools, but they have limitations. Human expertise and creativity are often needed to identify and address more complex or subtle vulnerabilities.",
            "A7V4Z2"
        ),
        KoanWithExplanation(
            "A system is only as secure as its most careless user.",
            "Even the most robust security can be compromised by a single user’s negligence. Security awareness and training are critical components of a secure environment.",
            "B9X2YQ"
        ),
        KoanWithExplanation(
            "Obscurity is not security, yet many confuse the shadow for the fortress.",
            "Relying on secrecy alone (security through obscurity) is a flawed strategy. True security comes from well-implemented and tested protections, not hidden mechanisms.",
            "P3J1LD"
        ),
        KoanWithExplanation(
            "The code is only as secure as the weakest developer's understanding.",
            "Security vulnerabilities often arise from developers' lack of knowledge. Building secure systems requires consistent security education across all contributors.",
            "Z6R9FT"
        ),
        KoanWithExplanation(
            "When you encrypt your data, you do not protect it from theft, but from understanding.",
            "Encryption does not prevent data from being accessed or stolen—it prevents unauthorized parties from making sense of it.",
            "D8M5CQ"
        ),
        KoanWithExplanation(
            "The path to enlightenment begins with acknowledging that all systems can be breached.",
            "Assuming breach is a realistic approach to cybersecurity. Recognizing this allows for building resilient systems prepared for compromise.",
            "L7U2WA"
        ),
        KoanWithExplanation(
            "The strongest defense is not built with technology, but with awareness.",
            "User education, vigilance, and a security-first mindset often prevent breaches more effectively than technical solutions alone.",
            "K5N4EZ"
        ),
        KoanWithExplanation(
            "In the calm mind of the security master, patches are applied before vulnerabilities are known.",
            "Proactive patching, hardening, and secure design prevent many zero-day attacks. Anticipating rather than reacting is key.",
            "S1X8TR"
        ),
        KoanWithExplanation(
            "The wise security expert builds not higher walls, but more observant eyes.",
            "Instead of relying solely on defense mechanisms, focus on visibility, detection, and quick response to threats.",
            "M4B6KU"
        ),
        KoanWithExplanation(
            "A single unpatched system can compromise an entire network, just as one poisoned thought can taint all wisdom.",
            "An unpatched vulnerability in one machine can serve as a gateway to compromise an entire infrastructure. Consistency in security is essential.",
            "R9Y3NH"
        ),
        KoanWithExplanation(
            "True security is not about preventing entry, but knowing when entry occurs.",
            "Absolute prevention is impossible; timely detection and response are what truly protect systems.",
            "E2Q7JW"
        ),
        KoanWithExplanation(
            "The careless click is more dangerous than the sophisticated exploit.",
            "Phishing and social engineering often bypass technical controls. Human error is a frequent attack vector.",
            "W8Z1GD"
        ),
        KoanWithExplanation(
            "In the realm of cybersecurity, what you don't know can indeed harm you.",
            "Unawareness of vulnerabilities, misconfigurations, or threat actors puts systems at significant risk.",
            "T3L6VA"
        ),
        KoanWithExplanation(
            "The hacker and the defender walk the same path, but with different intentions.",
            "Both attackers and defenders understand systems deeply, but their goals diverge—one seeks to exploit, the other to protect.",
            "H5C9XE"
        ),
        KoanWithExplanation(
            "Yesterday's security is today's vulnerability.",
            "Security measures that were once effective may become obsolete as threats evolve. Regular updates and reassessment are essential.",
            "J3R7QP"
        ),
        KoanWithExplanation(
            "The master knows: There is no security, only degrees of insecurity.",
            "Absolute security is a myth. Every system carries risk, and the goal is to manage and minimize that risk.",
            "V9E6KM"
        ),
        KoanWithExplanation(
            "Digital footprints in the sand will long outlast your journey.",
            "Your online activities leave permanent traces. These digital artifacts can be exploited if not managed carefully.",
            "C2N8HL"
        ),
        KoanWithExplanation(
            "A good password is like a well-crafted koan - complex to outsiders, meaningful to you.",
            "Strong passwords should be unique, hard to guess, but memorable to the creator—much like a personal riddle.",
            "B4Z3XD"
        ),
        KoanWithExplanation(
            "In the digital realm, trust is given too freely and verified too rarely.",
            "Blind trust in systems, users, or services leads to exploitation. Trust must be earned and continuously verified.",
            "U1Q9AT"
        ),
        KoanWithExplanation(
            "While you build walls around your castle, the enemy tunnels beneath.",
            "Attackers often bypass traditional defenses by exploiting overlooked or unconventional pathways.",
            "G5W7NR"
        ),
        KoanWithExplanation(
            "A secure network breathes like a living being, always adapting, never static.",
            "Security is not a one-time setup. It requires constant monitoring, updating, and evolution to remain effective.",
            "F6M2DJ"
        ),
        KoanWithExplanation(
            "The most dangerous attacks are those you have convinced yourself cannot happen.",
            "Complacency and assumptions are dangerous. Being open to unexpected threats is vital for robust defense.",
            "L8K1EV"
        ),
        KoanWithExplanation(
            "The security professional sees vulnerabilities in the most elegant solutions.",
            "Security-minded individuals critically examine even the most beautiful systems, knowing that form does not guarantee safety.",
            "X9T4PC"
        ),
        KoanWithExplanation(
            "Prepare not for the attacks you know, but for those you haven't imagined.",
            "Effective defense involves anticipating unknown threats, not just guarding against known ones.",
            "S7D3YU"
        ),
        KoanWithExplanation(
            "In security, doing nothing is a decision with consequences.",
            "Neglecting to act—whether to patch, update, or train—can result in vulnerabilities that are exploited later.",
            "R2L5MN"
        ),
        KoanWithExplanation(
            "To achieve security, you must first embrace insecurity.",
            "Understanding that no system is perfectly secure fosters vigilance, preparedness, and continuous improvement.",
            "K6J8WF"
        ),
        KoanWithExplanation(
            "The beginner sees code; the expert sees potential exploits.",
            "While novices focus on what the code is intended to do, experienced security professionals focus on how it can be misused or broken.",
            "N7F3LA"
        ),
        KoanWithExplanation(
            "Zero-days are not created; they are discovered like ancient treasures hidden in plain sight.",
            "Zero-day vulnerabilities often exist unnoticed for years. They are revealed through deep analysis and creative exploration.",
            "Y4R6XE"
        ),
        KoanWithExplanation(
            "The security of yesterday provides no comfort for the threats of tomorrow.",
            "Cyber threats evolve rapidly. Security strategies must adapt continuously to remain effective.",
            "P2W9DV"
        ),
        KoanWithExplanation(
            "Cyber enlightenment comes not from avoiding risks, but from understanding them fully.",
            "True cyber awareness means facing and analyzing risks in order to mitigate them—not pretending they don't exist.",
            "H1K7QZ"
        ),
        KoanWithExplanation(
            "A secure perimeter is meaningless when the threat resides within.",
            "Insider threats bypass external defenses. Security must also address internal risks through access control and monitoring.",
            "D5M8RU"
        ),
        KoanWithExplanation(
            "As the river flows around the rock, so will attackers flow around your defenses.",
            "Attackers adapt quickly. Defensive strategies must be flexible and consider alternative attack paths.",
            "T6Z2MP"
        ),
        KoanWithExplanation(
            "The most secure data is that which does not exist.",
            "If sensitive data is never collected or stored, it cannot be stolen. Minimizing data reduces risk.",
            "K3L9WB"
        ),
        KoanWithExplanation(
            "Privacy and security are not the same mountain, but they share the same peak.",
            "Though privacy and security are distinct goals, they often overlap and support each other when pursued correctly.",
            "F9C1XE"
        ),
        KoanWithExplanation(
            "The defender must be right every time; the attacker need only be right once.",
            "Defense requires constant vigilance and perfection, while an attacker needs only a single mistake to succeed.",
            "Q8F1ZE"
        ),
        KoanWithExplanation(
            "The greatest vulnerability often lies in the space between systems that each believes the other is securing.",
            "Security gaps frequently occur at integration points where assumptions are made about responsibilities.",
            "J6P3WR"
        ),
        KoanWithExplanation(
            "Beware the security that announces itself loudly, for true security moves in silence.",
            "Effective security is often quiet, subtle, and unobtrusive—not boastful or obvious.",
            "M2K7CX"
        ),
        KoanWithExplanation(
            "If you believe your system is secure, you have not looked hard enough.",
            "Confidence in security can lead to complacency. Constant testing and scrutiny are essential.",
            "E9T6LB"
        ),
        KoanWithExplanation(
            "The unpatched system tempts fate; the patched system merely postpones it.",
            "Patching known vulnerabilities is critical, but it's not a final solution—new threats will always emerge.",
            "U5V2DA"
        ),
        KoanWithExplanation(
            "In the digital monastery, the monks patch daily and remain ever vigilant.",
            "Security is a daily practice of maintenance and mindfulness, not a one-time task.",
            "A3N8GQ"
        ),
        KoanWithExplanation(
            "Security is not a product to buy, but a process to live.",
            "Security is a continuous effort involving people, processes, and technology—not just tools or solutions.",
            "Y4M6TP"
        ),
        KoanWithExplanation(
            "To know the hacker, you must first become the hacker, yet retain the ethics the hacker has forsaken.",
            "Understanding attacker behavior is key to defense, but ethical boundaries must always be maintained.",
            "C1H9XE"
        ),
        KoanWithExplanation(
            "The most secure algorithm is worthless in the hands of the careless developer.",
            "Even the best cryptographic tools can be undermined by improper implementation or poor coding practices.",
            "W7K4NZ"
        ),
        KoanWithExplanation(
            "The smartphone in your pocket knows you better than your closest friend.",
            "Mobile devices collect immense amounts of personal data, making them prime targets and critical to secure.",
            "L9F3UJ"
        ),
        KoanWithExplanation(
            "Complexity is the enemy of security, while simplicity is its faithful companion.",
            "Complex systems are harder to secure and audit. Simplicity enhances clarity and reduces attack surfaces.",
            "T2X5MQ"
        ),
        KoanWithExplanation(
            "What appears as paranoia to the novice is prudence to the security master.",
            "Experienced security professionals anticipate threats others may dismiss. Vigilance can appear excessive to the untrained.",
            "B6Z1RV"
        ),
        KoanWithExplanation(
            "As a lock doesn't make a door impenetrable, encryption doesn't make data impervious.",
            "Encryption is a strong defense, but not infallible. Implementation flaws and key management remain points of risk.",
            "R3J7KY"
        ),
        KoanWithExplanation(
            "The wise security master knows: perfect security is a destination never reached.",
            "Security is a continuous journey. Perfection is unattainable, but striving toward it yields better resilience.",
            "H3T9QW"
        ),
        KoanWithExplanation(
            "A system untested is a system vulnerable.",
            "Without regular testing and validation, vulnerabilities may remain hidden, ready to be exploited.",
            "L5M2XE"
        ),
        KoanWithExplanation(
            "Digital keys without digital locks are as useful as fish without water.",
            "Cryptographic keys must be tied to proper access control and encryption mechanisms to be effective.",
            "F9C7UV"
        ),
        KoanWithExplanation(
            "In the garden of security, vigilance is the constant gardener.",
            "Ongoing attention and maintenance are necessary to nurture and preserve a secure environment.",
            "Z6Y3PL"
        ),
        KoanWithExplanation(
            "The security master builds redundancy, for they know all defenses eventually fail.",
            "No defense is perfect. Redundancy ensures that when one measure fails, others can take over.",
            "A1W8KJ"
        ),
        KoanWithExplanation(
            "The safest computer is one never built; the safest code is never written.",
            "All systems carry risk. The only perfectly secure system is one that doesn't exist—but that’s not practical.",
            "N4E5BX"
        ),
        KoanWithExplanation(
            "The perimeter is dead; identity is the new boundary.",
            "Traditional network borders are fading. Security now relies on verifying identity regardless of location.",
            "Q8L6DY"
        ),
        KoanWithExplanation(
            "The greatest threat to security is the belief it has been achieved.",
            "Complacency is dangerous. Assuming a system is secure often leads to oversight and increased risk.",
            "S7J9HM"
        ),
        KoanWithExplanation(
            "Old vulnerabilities never die; they merely wait for memory to fade.",
            "Legacy systems and forgotten flaws often re-emerge as threats when they are no longer actively remembered or maintained.",
            "K2M4ZR"
        ),
        KoanWithExplanation(
            "An alert without context is like a sword without a handle - dangerous and useless.",
            "Security alerts must be actionable and informative. Without context, they lead to confusion or inaction.",
            "B5V3TW"
        ),
        KoanWithExplanation(
            "Security at the expense of functionality is no security at all.",
            "If users bypass security for usability, it defeats the purpose. Good security supports, not hinders, functionality.",
            "Y3P6CD"
        ),
        KoanWithExplanation(
            "The secure system is not the one that never fails, but the one that fails gracefully.",
            "Security includes planning for failure and ensuring that breaches are limited and recoverable.",
            "D6X1NA"
        ),
        KoanWithExplanation(
            "To provide security is to anticipate chaos while creating calm.",
            "Security professionals must expect disruption and prepare for it, while ensuring systems remain stable and user-friendly.",
            "T9R4GV"
        ),

        KoanWithExplanation(
            "Automate the predictable, so you can focus on the unpredictable.",
            "Automation helps handle routine tasks, freeing human attention for novel and complex threats that machines can't anticipate.",
            "E7M4PD"
        ),
        KoanWithExplanation(
            "In security, visibility is a fortress more valuable than any firewall.",
            "You can't protect what you can't see. Monitoring and awareness are foundational to effective defense.",
            "X2N9QJ"
        ),
        KoanWithExplanation(
            "The most important security update is the one not yet installed.",
            "Timely updates are critical. Unpatched vulnerabilities are often exploited soon after discovery.",
            "R1C8FV"
        ),
        KoanWithExplanation(
            "Like the oak that bends in the wind, the secure system must adapt to survive.",
            "Security systems must be resilient and flexible to withstand evolving threats.",
            "L3W6ZU"
        ),
        KoanWithExplanation(
            "The line between security and paranoia is drawn with the pen of experience.",
            "Experienced professionals understand when caution is warranted and when it's excessive.",
            "H9B5MC"
        ),
        KoanWithExplanation(
            "True wisdom in security is knowing the limits of your knowledge.",
            "Recognizing what you don't know fosters humility and encourages continuous learning and vigilance.",
            "T6Y2JA"
        ),
        KoanWithExplanation(
            "The loud security breach is not what should frighten you; it's the silent one you haven't detected.",
            "Undetected intrusions are more dangerous than visible ones, as they can persist and cause long-term harm.",
            "N8K4ES"
        ),
        KoanWithExplanation(
            "Vulnerabilities are not bugs; they are features seen from a different perspective.",
            "Exploits often arise from intended behavior used in unintended ways. Understanding design flaws is key to defense.",
            "M5Q1UX"
        ),
        KoanWithExplanation(
            "The fingerprints you leave on the digital world can never be fully erased.",
            "Digital traces are persistent. Online actions often remain long after they're forgotten or deleted.",
            "Z4R7WB"
        ),
        KoanWithExplanation(
            "Security is not a shield you deploy, but a culture you nurture.",
            "True security requires shared responsibility and awareness across the entire organization, not just tools.",
            "A9V2KH"
        ),
        KoanWithExplanation(
            "The same lock that keeps others out may one day keep you in.",
            "Security mechanisms must be designed with care to avoid locking out legitimate users or administrators.",
            "K1D6YT"
        ),
        KoanWithExplanation(
            "The master knows: Defense in depth is not just layers, but diverse thinking.",
            "True defense in depth involves varied perspectives and strategies, not just stacking technologies.",
            "W3K7DN"
        ),
        KoanWithExplanation(
            "The misconfiguration is often more dangerous than the exploit.",
            "Simple mistakes in setup can expose systems more easily than complex vulnerabilities.",
            "L9F2VC"
        ),
        KoanWithExplanation(
            "Security by obscurity is like hiding a key under a doormat – effective only against those who don't look.",
            "Relying solely on secrecy provides minimal protection against determined attackers.",
            "X1P6RA"
        ),
        KoanWithExplanation(
            "The secure mindset asks not 'Is this system secure?' but 'How might this system fail?'",
            "Effective security involves anticipating weaknesses, not assuming strength.",
            "B6Y3LU"
        ),
        KoanWithExplanation(
            "In the digital realm, convenience and security are eternal adversaries.",
            "Enhancing usability often reduces security, and vice versa; balance is key.",
            "Q2M9TE"
        ),
        KoanWithExplanation(
            "The prudent security expert trusts, but verifies; the wise one verifies, then trusts minimally.",
            "Assumptions must be validated—true wisdom in security is grounded in skepticism and verification.",
            "H7Z1CP"
        ),
        KoanWithExplanation(
            "A security policy ignored is worse than having no policy at all.",
            "Unenforced policies create false confidence and inconsistent practices, leading to vulnerabilities.",
            "D3W5KX"
        ),
        KoanWithExplanation(
            "The secure network is aware of its own heartbeat and knows when it skips.",
            "Continuous monitoring is essential to detect anomalies and signs of intrusion quickly.",
            "T8C4QN"
        ),
        KoanWithExplanation(
            "Today's encryption is tomorrow's plaintext.",
            "Cryptographic methods become obsolete. Data secured today may be vulnerable in the future.",
            "F9L6BY"
        ),
        KoanWithExplanation(
            "Do not seek to eliminate risk, for that is impossible; seek instead to manage it wisely.",
            "Risk is inherent. The goal of security is intelligent risk management, not total elimination.",
            "M5E8ZD"
        ),
        KoanWithExplanation(
            "The wise security practitioner knows that all defenses are temporary.",
            "No system remains secure forever. Continuous improvement and adaptation are required.",
            "N2J4WR"
        ),
        KoanWithExplanation(
            "The secure system whispers; the vulnerable one shouts.",
            "Secure systems operate quietly and predictably; breaches often cause noise, anomalies, or chaos.",
            "Y6T9XH"
        ),
        KoanWithExplanation(
            "The root of many breaches is not technology, but human psychology.",
            "Human behavior, such as falling for phishing or using weak passwords, is often the weakest link in security.",
            "G4Y7KL"
        ),
        KoanWithExplanation(
            "Two-factor authentication is like having both a lock and a guard – neither perfect, but better together.",
            "Combining multiple layers of security, like passwords and one-time codes, strengthens overall protection.",
            "X3N2TP"
        ),
        KoanWithExplanation(
            "Security expertise is not measured by certifications, but by scars earned from past battles.",
            "Real-world experience and lessons from failure often shape stronger security professionals than credentials alone.",
            "V6R8MJ"
        ),
        KoanWithExplanation(
            "The path of least resistance is the attacker's favorite trail.",
            "Attackers often target the simplest, weakest points in a system, such as exposed ports or untrained users.",
            "Z2D5WN"
        ),
        KoanWithExplanation(
            "Trust, like access, should be granted minimally and reviewed regularly.",
            "Minimizing and regularly auditing access helps reduce risk from both internal and external threats.",
            "K9M1CE"
        ),
        KoanWithExplanation(
            "In the face of advanced threats, humility is the security professional's greatest asset.",
            "Acknowledging that one’s defenses may fail allows for better preparation and response strategies.",
            "L5B3AX"
        ),
        KoanWithExplanation(
            "The same openness that allows innovation also creates vulnerability.",
            "Openness and accessibility can accelerate progress, but they must be balanced with security safeguards.",
            "D7Q6UV"
        ),
        KoanWithExplanation(
            "The greatest risk often lies not in what you know, but in what you think you know.",
            "Overconfidence and false assumptions can lead to blind spots that attackers exploit.",
            "P8T4ZY"
        ),
        KoanWithExplanation(
            "A complex password easily forgotten offers no more protection than a simple one never changed.",
            "Security measures must be usable; otherwise, they are either bypassed or ineffective.",
            "M6V9HR"
        ),
        KoanWithExplanation(
            "The security architecture is only as strong as its assumptions.",
            "Designing systems based on flawed or unverified assumptions can lead to serious vulnerabilities.",
            "R1C3FB"
        ),
        KoanWithExplanation(
            "The prepared security master has already considered how their own defenses will fail.",
            "Anticipating failure points allows defenders to strengthen weak spots before attackers exploit them.",
            "J4V9XE"
        ),
        KoanWithExplanation(
            "Enlightenment comes when you realize the attacker is not your enemy, but your teacher.",
            "Studying attacker methods helps improve defenses by learning from their techniques and mindset.",
            "H2P7CW"
        ),
        KoanWithExplanation(
            "The secure mindset finds vulnerabilities by asking not 'Does this work?' but 'How could this fail?'",
            "Effective security analysis focuses on potential failure modes rather than just functionality.",
            "N6D3TZ"
        ),
        KoanWithExplanation(
            "A false sense of security is more dangerous than the acknowledgment of vulnerability.",
            "Ignoring risks leads to complacency, while recognizing vulnerabilities fosters proactive defense.",
            "F8Q5LR"
        ),
        KoanWithExplanation(
            "The security of a system can be measured not by its strength, but by its recovery capability.",
            "The ability to detect, respond, and recover from attacks is a crucial security metric.",
            "M3Y1WV"
        ),
        KoanWithExplanation(
            "The wise security professional knows that the absence of evidence is not evidence of absence.",
            "Not finding a breach does not guarantee it hasn’t happened; vigilance must continue.",
            "S7X2JP"
        ),
        KoanWithExplanation(
            "Security is not a destination, but a journey without end.",
            "Security requires continuous effort, adaptation, and improvement as threats evolve.",
            "R9B4KC"
        ),
        KoanWithExplanation(
            "The master understands: To secure everything is to secure nothing.",
            "Trying to protect every single aspect without prioritization dilutes focus and effectiveness.",
            "V5W8NG"
        ),
        KoanWithExplanation(
            "Every new feature is a potential vulnerability waiting to be discovered.",
            "Adding complexity and new capabilities often introduces unforeseen security risks.",
            "D1M6FQ"
        ),
        KoanWithExplanation(
            "The attacker needs only find one way in; the defender must find them all.",
            "Attackers win with a single success; defenders must be thorough and vigilant everywhere.",
            "L4K3XZ"
        ),
        KoanWithExplanation(
            "When security becomes invisible, it becomes invincible.",
            "Seamless, unobtrusive security mechanisms reduce risk by minimizing human error and detection.",
            "T8JPYR"
        ),
        KoanWithExplanation(
            "To understand security, you must first understand human nature.",
            "Security measures must account for human behavior, motivations, and errors to be effective.",
            "C5W9LK"
        ),
        KoanWithExplanation(
            "In the race between security patches and exploits, the swift survive.",
            "Timely patching is critical to prevent attackers from exploiting known vulnerabilities.",
            "Z2H8MB"
        ),
        KoanWithExplanation(
            "A security camera pointed at nothing offers perfect surveillance of nothing.",
            "Security tools are only effective when properly configured and actively monitored.",
            "P7JDQA"
        ),
        KoanWithExplanation(
            "The humble system administrator does more for security than the boastful security vendor.",
            "Effective security depends on diligent administrators, not just marketing claims or tools.",
            "R4F3NX"
        ),
        KoanWithExplanation(
            "The wise security master makes backups of backups, for redundancy is the child of wisdom.",
            "Multiple layers of backup ensure data safety even if primary copies fail.",
            "Y1TCVB"
        ),
        KoanWithExplanation(
            "Like a zen garden, security requires constant tending, not occasional redesign.",
            "Ongoing maintenance and vigilance are essential to sustain strong security posture.",
            "M8EGPX"
        ),
        KoanWithExplanation(
            "The password manager remembers so you need not, freeing your mind for greater security wisdom.",
            "Using password managers helps maintain strong, unique credentials without mental burden.",
            "Q3VKZT"
        ),
        KoanWithExplanation(
            "The alert that cries 'wolf' too often will be ignored when the real wolf appears.",
            "Excessive false alarms desensitize responders, risking missed real threats.",
            "B6N2RL"
        ),
        KoanWithExplanation(
            "Security through obscurity is like hiding in shadows—effective until someone turns on the light.",
            "Relying solely on secrecy is fragile; determined attackers will eventually uncover hidden flaws.",
            "X9F7JH"
        ),
        KoanWithExplanation(
            "The most dangerous attack vector is the one you dismissed as impossible.",
            "Ignoring unlikely threats can leave systems vulnerable to unexpected attacks.",
            "N7D2FX"
        ),
        KoanWithExplanation(
            "Compliance is the beginning of security, not its destination.",
            "Meeting standards is a foundation, but true security requires ongoing effort beyond compliance.",
            "L3WPQY"
        ),
        KoanWithExplanation(
            "A security blanket provides comfort, not protection.",
            "Superficial measures may ease anxiety but do little to truly secure systems.",
            "X8V6AR"
        ),
        KoanWithExplanation(
            "The ransomware teaches us the value of what we failed to protect.",
            "Attacks highlight gaps in defenses and the critical importance of safeguarding assets.",
            "M4YJTN"
        ),
        KoanWithExplanation(
            "Security is not built in a day, but can be destroyed in a second.",
            "A single mistake or breach can undo months or years of protective effort instantly.",
            "Q1CZRD"
        ),
        KoanWithExplanation(
            "Logs unread are like koans unheard—wisdom waiting to be discovered.",
            "Analyzing logs is crucial to detect patterns, threats, and improve security posture.",
            "G9HBXE"
        ),
        KoanWithExplanation(
            "The thoughtful security architect plans for failure as diligently as for success.",
            "Designing for resilience requires anticipating and preparing for potential failures.",
            "P5F3MK"
        ),
        KoanWithExplanation(
            "Authentication asks who you are; authorization asks what you may do. Both questions are equally important.",
            "Verifying identity and permissions are fundamental pillars of security control.",
            "T7JNVC"
        ),
        KoanWithExplanation(
            "Like meditation, security awareness must be practiced daily to achieve enlightenment.",
            "Continuous learning and vigilance strengthen an individual’s security mindset over time.",
            "R6Y8LW"
        ),
        KoanWithExplanation(
            "The secure mind questions even its own assumptions.",
            "Constant self-evaluation helps uncover hidden flaws and improves defensive strategies.",
            "D2VKFH"
        ),
        KoanWithExplanation(
            "The well-designed security system functions so naturally that its absence would be unnatural.",
            "Effective security integrates seamlessly into systems without disrupting user experience or operations.",
            "V3J7RM"
        ),
        KoanWithExplanation(
            "Fear is a poor security advisor; caution is a wise one.",
            "Rational, measured approaches to security decisions lead to better outcomes than panic-driven actions.",
            "T5QNLD"
        ),
        KoanWithExplanation(
            "The metadata often reveals more than the data it describes.",
            "Information about data—like timestamps or location—can expose sensitive details if not protected.",
            "K8YXWB"
        ),
        KoanWithExplanation(
            "In security, the path of least privilege leads to the peak of greatest protection.",
            "Restricting access rights to the minimum necessary greatly reduces attack surfaces.",
            "Z2F6PM"
        ),
        KoanWithExplanation(
            "A dashboard of green statuses brings false comfort to the naïve security team.",
            "Overreliance on superficial metrics can blind teams to underlying or emerging risks.",
            "M1DLXJ"
        ),
        KoanWithExplanation(
            "The wise security professional knows that perfect security and usability are opposing forces that must be balanced.",
            "Security must be strong yet practical; overly restrictive controls can hinder legitimate use.",
            "Y7CRKT"
        ),
        KoanWithExplanation(
            "The privilege you grant today may become the vulnerability of tomorrow.",
            "Access permissions should be regularly reviewed to prevent escalating risks over time.",
            "B4HVZS"
        ),
        KoanWithExplanation(
            "Like a rock in a river, defenses that don't adapt will eventually be worn away or circumvented.",
            "Static defenses lose effectiveness; security must evolve to meet new threats.",
            "Q9TPFN"
        ),
        KoanWithExplanation(
            "Each layer of security should assume the failure of all others.",
            "Defense in depth means no single control is relied upon exclusively for protection.",
            "L6W8AE"
        ),
        KoanWithExplanation(
            "The cybersecurity master knows that the greatest security breakthrough often comes from questioning basic assumptions.",
            "Challenging conventional wisdom can reveal overlooked vulnerabilities or innovative solutions.",
            "F5R2MY"
        ),
        KoanWithExplanation(
            "To the prepared mind, an incident is an opportunity; to the unprepared, a disaster.",
            "Readiness turns security events into lessons and improvements instead of chaos.",
            "H1GXKV"
        ),
        KoanWithExplanation(
            "Firewalls create boundaries, not security.",
            "Firewalls are tools that limit exposure but must be part of a comprehensive security strategy.",
            "E7JYQD"
        ),
        KoanWithExplanation(
            "The wise security professional trusts the attacker's persistence more than their own vigilance.",
            "Attackers keep trying tirelessly; defenders must never become complacent or overconfident.",
            "G4PX8K"
        ),
        KoanWithExplanation(
            "In the land of security, today's best practice is tomorrow's minimum standard.",
            "Security evolves rapidly; staying current means continually raising the bar.",
            "N9V2JS"
        ),
        KoanWithExplanation(
            "The breach you discover today began months ago.",
            "Intrusions often occur long before detection, emphasizing the need for proactive monitoring.",
            "Y3DLHW"
        ),
        KoanWithExplanation(
            "Threat intelligence without action is merely knowledge without wisdom.",
            "Information about threats must be actively used to improve defenses and responses.",
            "Q7EMZP"
        ),
        KoanWithExplanation(
            "The most secure configuration is often the one with the least features enabled.",
            "Minimizing enabled features reduces the attack surface and potential vulnerabilities.",
            "B1KRFS"
        ),
        KoanWithExplanation(
            "Like the moon reflecting in water, security incidents reflect organizational culture.",
            "How an organization handles security events reveals its priorities and maturity.",
            "V8J5XN"
        ),
        KoanWithExplanation(
            "In penetration testing, what you don't find is as important as what you do.",
            "Absence of evidence can indicate strong defenses or gaps in testing scope.",
            "M6CZQW"
        ),
        KoanWithExplanation(
            "The security expert sees the whole chessboard; the hacker needs only see the path to the king.",
            "Defenders must consider all possible attack vectors, while attackers focus on critical weaknesses.",
            "L4HDPN"
        ),
        KoanWithExplanation(
            "The security team that celebrates finding vulnerabilities will find more than the team that hides them.",
            "Openness and learning from flaws improve security more than denial or concealment.",
            "S9YKRV"
        ),
        KoanWithExplanation(
            "What your systems do in the shadows defines your security posture in the light.",
            "Hidden system behaviors can create risks and affect overall security trustworthiness.",
            "X2BTFJ"
        ),
        KoanWithExplanation(
            "The key that opens every door is the greatest liability.",
            "Excessive privileges pose serious risks if compromised or misused.",
            "F5QJLC"
        ),
        KoanWithExplanation(
            "In the security realm, intuition is the fruit of experience, not its substitute.",
            "Good instincts develop through learning and practice, not guesswork.",
            "R7MZDW"
        ),
        KoanWithExplanation(
            "Default credentials are like leaving your key in the lock—an invitation, not security.",
            "Failing to change defaults is a common and easily exploited security weakness.",
            "P3VNXT"
        ),
        KoanWithExplanation(
            "Monitor not just for what you expect, but for what you've never seen before.",
            "Detecting novel or unexpected activity is critical for identifying emerging threats.",
            "K8EGHY"
        ),
        KoanWithExplanation(
            "The secure organization knows its assets like a gardener knows their plants.",
            "Understanding and managing critical assets is essential for effective security.",
            "W6ZYTR"
        ),
        KoanWithExplanation(
            "Security at rest provides for peaceful sleep; security in motion provides for peaceful journeys.",
            "Protecting data both when stored and while being transmitted is vital for overall security.",
            "J9PXNB"
        ),
        KoanWithExplanation(
            "The wise security master rewards those who find flaws, not those who hide them.",
            "Encouraging transparency and vulnerability disclosure strengthens security.",
            "L4FKDV"
        ),
        KoanWithExplanation(
            "In security architecture, complexity is the mother of vulnerability.",
            "More complex systems are harder to secure and more prone to flaws.",
            "H8WMCQ"
        ),
        KoanWithExplanation(
            "The zero trust mindset begins with zero assumption.",
            "Trust nothing by default; always verify identities and access requests.",
            "D3EBVN"
        ),
        KoanWithExplanation(
            "A security control designed in isolation will fail in integration.",
            "Security measures must work together cohesively to be effective.",
            "R7MXLK"
        ),
        KoanWithExplanation(
            "The cyber threat is like water—it finds the path of least resistance.",
            "Attackers exploit the weakest points to bypass defenses.",
            "S1TQZH"
        ),
        KoanWithExplanation(
            "Sharing threat intelligence is giving light to others without diminishing your own.",
            "Collaboration improves overall security without weakening any participant.",
            "V6JPNR"
        ),
        KoanWithExplanation(
            "The security budget is best spent before the breach, not after.",
            "Proactive investment in security reduces damage and costs from incidents.",
            "C2KXFY"
        ),
        KoanWithExplanation(
            "Legacy systems are the ancestors of modern vulnerabilities.",
            "Old systems often contain outdated protections and hidden weaknesses.",
            "Z9WDGB"
        ),
        KoanWithExplanation(
            "The enlightened CISO knows that risk accepted is better than risk ignored.",
            "Acknowledging and managing risk wisely leads to stronger security postures.",
            "F5NLHT"
        ),
        KoanWithExplanation(
            "In the face of a zero-day, preparation matters more than prevention.",
            "Being ready to respond quickly is crucial when unknown vulnerabilities are exploited.",
            "M3RXYQ"
        ),
        KoanWithExplanation(
            "A secure culture cannot be purchased, only cultivated.",
            "Building strong security practices requires ongoing commitment and mindset change.",
            "P8VZKW"
        ),
        KoanWithExplanation(
            "The insider threat teaches us that trust is both necessary and dangerous.",
            "While trust is essential, insiders can pose significant risks if not properly monitored.",
            "H7MNQX"
        ),
        KoanWithExplanation(
            "Periodic security training without daily practice is like reading koans without meditation.",
            "Continuous application of security knowledge is key to effective defense.",
            "Z4TJYD"
        ),
        KoanWithExplanation(
            "The incident responder who has practiced need not panic when the real incident occurs.",
            "Preparedness through drills and simulations enables calm, effective incident handling.",
            "Q9FVPK"
        ),
        KoanWithExplanation(
            "The security perimeter is not where your network ends, but where your data travels.",
            "Protecting data movement is as important as securing network boundaries.",
            "L3CDRM"
        ),
        KoanWithExplanation(
            "The strongest authentication is meaningless if the authorization is flawed.",
            "Proper access controls must accompany authentication to ensure security.",
            "X5BYHS"
        ),
        KoanWithExplanation(
            "In cybersecurity, yesterday's exotic attack is today's penetration testing script.",
            "Attack techniques evolve quickly; what was rare becomes common knowledge.",
            "J8RNTZ"
        ),
        KoanWithExplanation(
            "The deadliest vulnerability is the one that looks too obvious to exploit.",
            "Overlooking simple flaws often leads to critical security breaches.",
            "V1QZFM"
        ),
        KoanWithExplanation(
            "A security policy never tested is a hypothesis, not a protection.",
            "Policies must be validated through regular testing and enforcement.",
            "P6LKXS"
        ),
        KoanWithExplanation(
            "The security team that operates in silos builds a fortress with hidden tunnels.",
            "Lack of communication creates unseen gaps in security defenses.",
            "D2WNVH"
        ),
        KoanWithExplanation(
            "The breach notification is the sound of one hand clapping—incomplete without response.",
            "Detection must be paired with timely and effective response to be meaningful.",
            "S7MRYA"
        ),
        KoanWithExplanation(
            "Security debt, like technical debt, accrues interest over time.",
            "Neglecting security issues leads to growing risk and higher future costs.",
            "F0GEZK"
        ),
        KoanWithExplanation(
            "The cutting edge of security is also its bleeding edge.",
            "Innovative defenses carry risk as they are untested and evolving.",
            "N5HVQC"
        ),
        KoanWithExplanation(
            "In the field of cybersecurity, the only constant is change.",
            "Cybersecurity is an ever-evolving discipline requiring continuous adaptation.",
            "R8YJWP"
        ),
        KoanWithExplanation(
            "Security through fear motivates briefly; security through understanding endures.",
            "Sustainable security comes from knowledge, not fear-based reactions.",
            "V2LQMN"
        ),
        KoanWithExplanation(
            "The security master knows that what cannot be measured cannot be improved.",
            "Effective security relies on metrics and continuous assessment.",
            "B5DKXA"
        ),
        KoanWithExplanation(
            "The first step in incident response is not to panic; the second is not to blame.",
            "Calm and focused response is key to managing security incidents effectively.",
            "F3NWGT"
        ),
        KoanWithExplanation(
            "API security is the art of protecting conversations you cannot hear between systems you do not control.",
            "Securing APIs requires vigilance over interactions beyond your immediate infrastructure.",
            "J9PTVC"
        ),
        KoanWithExplanation(
            "The CISO who speaks only of technology will never be heard in the boardroom.",
            "Effective security leadership requires translating technical risk into business impact.",
            "S0LRKM"
        ),
        KoanWithExplanation(
            "True governance is achieved not through mandates but through culture.",
            "Strong security depends on cultivating shared values and behaviors, not just rules.",
            "X6VYJD"
        ),
        KoanWithExplanation(
            "The supply chain is as secure as its weakest contributor.",
            "Vulnerabilities in third-party components can compromise your entire security.",
            "N4FQBR"
        ),
        KoanWithExplanation(
            "In the security realm, what is convenient is rarely secure, and what is secure is rarely convenient.",
            "Balancing usability and security is an ongoing challenge.",
            "M7HCZX"
        ),
        KoanWithExplanation(
            "Assume breach is not pessimism; it is preparation.",
            "Planning for inevitable breaches strengthens overall security resilience.",
            "D1EGWV"
        ),
        KoanWithExplanation(
            "The security professional's greatest asset is not tools but perspective.",
            "Insight and experience matter more than any security technology alone.",
            "K8QYAP"
        ),
        KoanWithExplanation(
            "The enlightened organization knows security is everyone's responsibility, but someone must still be accountable.",
            "While security requires collective effort, clear accountability ensures effective governance.",
            "Q2NMPX"
        ),
        KoanWithExplanation(
            "The most dangerous attack isn't the one that succeeds, but the one that succeeds without detection.",
            "Undetected breaches cause the greatest harm as they can persist and escalate unnoticed.",
            "W6FRJY"
        ),
        KoanWithExplanation(
            "Secure code reviews are like meditation on another's thoughts—seeking clarity in complexity.",
            "Reviewing code deeply uncovers hidden vulnerabilities and improves understanding.",
            "X8VLTZ"
        ),
        KoanWithExplanation(
            "The security control that is bypassed is worse than no control at all, for it provides false confidence.",
            "Ineffective controls create a dangerous illusion of safety.",
            "L9DPSW"
        ),
        KoanWithExplanation(
            "In cybersecurity, the cost of prevention is always less than the cost of cure.",
            "Investing in proactive measures saves resources compared to handling incidents later.",
            "J3CKRM"
        ),
        KoanWithExplanation(
            "Security awareness without action is like a koan without reflection—empty wisdom.",
            "Understanding risks means little without corresponding behaviors and measures.",
            "M1QHZA"
        ),
        KoanWithExplanation(
            "The greatest security risk is often the question never asked.",
            "Challenging assumptions uncovers hidden threats and gaps.",
            "Y5GWFX"
        ),
        KoanWithExplanation(
            "Ephemeral infrastructure offers both security benefits and monitoring challenges.",
            "Dynamic, temporary resources improve security posture but complicate oversight.",
            "T7LBVN"
        ),
        KoanWithExplanation(
            "The network defender who knows only defense will always be at the mercy of the attacker who knows both.",
            "Understanding offense strengthens defensive strategies.",
            "D4ZREJ"
        ),
        KoanWithExplanation(
            "Security standards are the beginning of wisdom, not its culmination.",
            "Standards provide a foundation, but true security requires ongoing improvement.",
            "P0VXKU"
        ),
        KoanWithExplanation(
            "The security professional must balance the ideal against the practical, like a monk balancing discipline with compassion.",
            "Effective security blends strict controls with flexible, human-centered approaches.",
            "F8MCSY"
        ),
        KoanWithExplanation(
            "In cloud security, what you don't configure explicitly will be configured for convenience, not security.",
            "Default settings often prioritize ease over protection, requiring careful attention.",
            "S9NHBD"
        ),
        KoanWithExplanation(
            "The attacker thinks 'how can I break in?'; the defender must think 'how would I break in?'",
            "Defenders must adopt the attacker’s mindset to anticipate and close security gaps.",
            "J7MF2L"
        ),
        KoanWithExplanation(
            "Security is the art of making the attacker's job harder than your own.",
            "Effective security increases the cost and complexity for attackers.",
            "N8CZVW"
        ),
        KoanWithExplanation(
            "The most critical security updates are the ones that interrupt your weekend.",
            "Urgent patches often require immediate action to prevent serious breaches.",
            "B3QRYH"
        ),
        KoanWithExplanation(
            "The wise security architect designs for resilience, not just resistance.",
            "Building systems that recover quickly is as important as preventing attacks.",
            "L6VXSM"
        ),
        KoanWithExplanation(
            "In the cybersecurity battle, visibility is the foundation of victory.",
            "Detecting threats early requires comprehensive monitoring and insight.",
            "S2HKEP"
        ),
        KoanWithExplanation(
            "The security team that learns from others' mistakes will have fewer of their own.",
            "Studying past incidents strengthens future defenses.",
            "F9TDZR"
        ),
        KoanWithExplanation(
            "Threat hunting is not about finding needles in haystacks, but about learning to see patterns in chaos.",
            "Effective threat hunting reveals hidden attack behaviors and trends.",
            "Y0LCXB"
        ),
        KoanWithExplanation(
            "The security program that cannot articulate its value will not receive the resources it needs.",
            "Clear communication of security’s impact is vital for sustained support.",
            "K4NJGD"
        ),
        KoanWithExplanation(
            "In cybersecurity, the student who becomes the master never stops being the student.",
            "Continuous learning is essential in the ever-evolving security landscape.",
            "Q1PFVW"
        ),
        KoanWithExplanation(
            "A vulnerability scanner finds only what it knows to look for; human creativity finds what has never been seen before.",
            "Automated tools have limits; human insight uncovers novel threats.",
            "W7DMKR"
        )
    )

    fun getRandomKoanWithExplanation(): KoanWithExplanation {
        // Simply return a random koan with its associated static code
        return koansWithExplanations.random()
    }

    fun getKoanById(id: Int): KoanWithExplanation? {
        // Find the koan with the matching unique code
        return koansWithExplanations.find { it.uniqueCode == id.toString() }
    }

    fun getRandomKoan(): String {
        return getRandomKoanWithExplanation().koanText
    }

    val koans: List<String>
        get() = koansWithExplanations.map { it.koanText }
}
