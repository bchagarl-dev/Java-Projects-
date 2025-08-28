# Bhavyasri Portfolio (React + Vite + Tailwind) — Netlify Ready

Multi-page portfolio with React Router (Home, About, Experience, Projects, Contact). Tailwind for styling. Netlify config included.

## Quick Start
```bash
npm i
npm run dev
```
Open http://localhost:5173

## Build
```bash
npm run build
```
`dist/` is created for deployment.

## Deploy to Netlify
1. Push this folder to a GitHub repo.
2. In Netlify: **Add new site → Import from Git**.
3. Select the repo.
4. Build command: `npm run build`
5. Publish directory: `dist`
6. Deploy.

Netlify Forms is preconfigured on the Contact page. View submissions in Netlify dashboard (Forms).

## Customize
- Edit personal info in `src/pages/*` and `src/components/Navbar.jsx`.
- Replace `/public/resume.pdf` with your real resume file.
- Update links in Projects page.
