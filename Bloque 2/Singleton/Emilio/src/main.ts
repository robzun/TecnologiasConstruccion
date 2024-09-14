import { DatabaseNotification } from "./DatabaseNotification";
import { EmailNotification } from "./EmailNotification";
import { NotificationManager } from "./NotificationManager";
import { PhoneNotification } from "./PhoneNotification";

const notificationManager = NotificationManager.getInstance()
const notificationManager2 = NotificationManager.getInstance()

const dbNotification = new DatabaseNotification(1)
const emailNotification = new EmailNotification('zhrine@gmail.com')
const phoneNotification = new PhoneNotification('9213211196')

notificationManager.sendNotification('new user registrated',dbNotification)
notificationManager2.sendNotification('confirm your email',emailNotification)
notificationManager.sendNotification('your activation code is 5698',phoneNotification)

console.log('History: ', notificationManager.getNotificationHistory)